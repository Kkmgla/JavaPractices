import java.util.LinkedList;

public class InternetOrdersManager implements OrdersManager {
    private QueueNode head;
    private QueueNode tail;
    private int size;

    public boolean add(Order order) {
        QueueNode newNode = new QueueNode(order);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
        return true;
    }

    public Order remove() {
        if (head == null) {
            return null;
        }
        QueueNode removedNode = head;
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }
        size--;
        return removedNode.value;
    }

    public Order order() {
        return (head != null) ? head.value : null;
    }

    public int itemsQuantity(String itemName) {
        int totalQuantity = 0;
        QueueNode currentNode = head;
        while (currentNode != null) {
            totalQuantity += currentNode.value.itemQuantity(itemName);
            currentNode = currentNode.next;
        }
        return totalQuantity;
    }

    public int itemsQuantity(MenuItem item) {
        int totalQuantity = 0;
        QueueNode currentNode = head;
        while (currentNode != null) {
            totalQuantity += currentNode.value.itemQuantity(item);
            currentNode = currentNode.next;
        }
        return totalQuantity;
    }

    public Order[] getOrders() {
        Order[] orders = new Order[size];
        QueueNode currentNode = head;
        int index = 0;
        while (currentNode != null) {
            orders[index] = currentNode.value;
            currentNode = currentNode.next;
            index++;
        }
        return orders;
    }

    public int ordersCostSummary() {
        int totalCost = 0;
        QueueNode currentNode = head;
        while (currentNode != null) {
            totalCost += currentNode.value.costTotal();
            currentNode = currentNode.next;
        }
        return totalCost;
    }

    public int ordersQuantity() {
        return size;
    }

    private static class QueueNode {
        Order value;
        QueueNode prev;
        QueueNode next;

        QueueNode(Order value) {
            this.value = value;
            this.prev = null;
            this.next = null;
        }
    }
}