import java.util.Arrays;

public class InternetOrder {
    private ListNode head;
    private int size;

    public InternetOrder() {
        this.head = new ListNode(null);
        this.size = 0;
    }

    public InternetOrder(Item[] items) {
        this.head = new ListNode(null);
        this.size = 0;
        for (Item item : items) {
            addItem(item);
        }
    }

    public boolean addItem(Item item) {
        ListNode newNode = new ListNode(item);
        ListNode lastNode = findLastNode();
        lastNode.next = newNode;
        newNode.prev = lastNode;
        size++;
        return true;
    }

    public boolean removeItem(String itemName) {
        ListNode currentNode = findLastNode();
        while (currentNode != head) {
            if (currentNode.value.getName().equals(itemName)) {
                currentNode.prev.next = currentNode.next;
                if (currentNode.next != null) {
                    currentNode.next.prev = currentNode.prev;
                }
                size--;
                return true;
            }
            currentNode = currentNode.prev;
        }
        return false;
    }

    public int removeAll(String itemName) {
        int count = 0;
        ListNode currentNode = findLastNode();
        while (currentNode != head) {
            if (currentNode.value.getName().equals(itemName)) {
                ListNode prevNode = currentNode.prev;
                prevNode.next = currentNode.next;
                if (currentNode.next != null) {
                    currentNode.next.prev = prevNode;
                }
                count++;
                size--;
            }
            currentNode = currentNode.prev;
        }
        return count;
    }

    public int getOrderSize() {
        return size;
    }

    public Item[] getItems() {
        Item[] items = new Item[size];
        ListNode currentNode = head.next;
        int index = 0;
        while (currentNode != null) {
            items[index] = currentNode.value;
            currentNode = currentNode.next;
            index++;
        }
        return items;
    }

    public double getTotalCost() {
        double totalCost = 0.0;
        ListNode currentNode = head.next;
        while (currentNode != null) {
            totalCost += currentNode.value.getPrice();
            currentNode = currentNode.next;
        }
        return totalCost;
    }

    public int getItemQuantity(String itemName) {
        int count = 0;
        ListNode currentNode = head.next;
        while (currentNode != null) {
            if (currentNode.value.getName().equals(itemName)) {
                count++;
            }
            currentNode = currentNode.next;
        }
        return count;
    }

    public String[] getItemNames() {
        String[] names = new String[size];
        ListNode currentNode = head.next;
        int index = 0;
        while (currentNode != null) {
            names[index] = currentNode.value.getName();
            currentNode = currentNode.next;
            index++;
        }
        return names;
    }

    public Item[] getSortedItemsByCostDesc() {
        Item[] items = getItems();
        Arrays.sort(items, (item1, item2) -> Double.compare(item2.getPrice(), item1.getPrice()));
        return items;
    }

    private ListNode findLastNode() {
        ListNode currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    private static class ListNode {
        Item value;
        ListNode prev;
        ListNode next;

        ListNode(Item value) {
            this.value = value;
            this.prev = null;
            this.next = null;
        }
    }
}