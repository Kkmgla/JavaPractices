public class DoubleLinkedList<Integer> {
    private Node<Integer> head;
    private Node<Integer> tail;

    public boolean isEmpty() {
        return head == null;
    }
    public void addFirst(Integer data) {
        Node<Integer> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Integer data) {
        Node<Integer> newNode = new Node<>(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void removeFirst() {
        if (head == null) {
            return;
        }
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }
    }

    public int removeLast() {
        if (tail == null) {
            return 0;
        }
        tail = tail.prev;
        if (tail != null) {
            tail.next = null;
        } else {
            head = null;
        }
        return 0;
    }

    public Integer getLast() {
        return tail.data;
    }
    public Integer getFirst() {
        return head.data;
    }
    public int size() {
        int count = 0;
        Node<Integer> current = head;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }
    public void printList() {
        Node<Integer> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

}