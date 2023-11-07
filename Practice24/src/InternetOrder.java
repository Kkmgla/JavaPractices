import java.util.Arrays;
import java.util.Objects;

public class InternetOrder implements Order{
    private ListNode head;
    private int size;
    private Customer customer;

    public InternetOrder() {
        this.head = new ListNode(null);
        this.size = 0;
        this.customer = Customer.MATURE_UNKNOWN_CUSTOMER;
    }
    @Override
    public boolean add(MenuItem item) {
        ListNode newNode = new ListNode(item);
        ListNode lastNode = findLastNode();
        lastNode.next = newNode;
        newNode.prev = lastNode;
        size++;
        return true;
    }
    @Override
    public String[] itemsNames() {
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
    @Override
    public int itemsQuantity() {
        return size;
    }
    @Override
    public int itemQuantity(String itemName) {
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
    @Override
    public int itemQuantity(MenuItem item) {
        int totalQuantity = 0;
        ListNode currentNode = head;
        while (currentNode != null) {
            if (currentNode.value.getName().equals(item.getName())) {
                totalQuantity++;
            }
            currentNode = currentNode.next;
        }
        return totalQuantity;
    }
    @Override
    public MenuItem[] getItems() {
        MenuItem[] items = new MenuItem[size];
        ListNode currentNode = head.next;
        int index = 0;
        while (currentNode != null) {
            items[index] = currentNode.value;
            currentNode = currentNode.next;
            index++;
        }
        return items;
    }
    @Override
    public boolean remove(String itemName) {
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
    @Override
    public boolean remove(MenuItem item) {
        ListNode currentNode = findLastNode();
        while (currentNode != head) {
            if (currentNode.value.getName().equals(item.getName())) {
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
    @Override
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
    @Override
    public int removeAll(MenuItem item) {
        int count = 0;
        ListNode currentNode = findLastNode();
        while (currentNode != head) {
            if (currentNode.value.getName().equals(item.getName())) {
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

    @Override
    public MenuItem[] sortedItemsByCostDesc() {
        MenuItem[] items = getItems();
        Arrays.sort(items, (item1, item2) -> Double.compare(item2.getCost(), item1.getCost()));
        return items;
    }
    @Override
    public int costTotal() {
        int totalCost = 0;
        ListNode currentNode = head.next;
        while (currentNode != null) {
            totalCost += currentNode.value.getCost();
            currentNode = currentNode.next;
        }
        return totalCost;
    }
    @Override
    public Customer getCustomer() {
        return customer;
    }

    @Override
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public int getOrderSize() {
        return size;
    }
    private ListNode findLastNode() {
        ListNode currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }
    private static class ListNode {
        MenuItem value;
        ListNode prev;
        ListNode next;

        ListNode(MenuItem value) {
            this.value = value;
            this.prev = null;
            this.next = null;
        }
    }
}