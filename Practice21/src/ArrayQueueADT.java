public class ArrayQueueADT<T> {
    private int front = 0;
    private int rear = -1;
    private int size = 0;
    private int capacity = 100;
    private T[] elements = (T[]) new Object[capacity];

    public static <T> void enqueue(ArrayQueueADT<T> queue, T t) {
        if (queue.size == queue.capacity) {
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }

        queue.rear = (queue.rear + 1) % queue.capacity;
        queue.elements[queue.rear] = t;
        queue.size++;
    }

    public static <T> T element(ArrayQueueADT<T> queue) {
        if (isEmpty(queue)) {
            System.out.println("Queue is empty. No element to return.");
            return null;
        }

        return queue.elements[queue.front];
    }

    public static <T> T dequeue(ArrayQueueADT<T> queue) {
        if (isEmpty(queue)) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return null;
        }

        T removedItem = queue.elements[queue.front];
        queue.front = (queue.front + 1) % queue.capacity;
        queue.size--;
        return removedItem;
    }

    public static <T> int size(ArrayQueueADT<T> queue) {
        return queue.size;
    }

    public static <T> boolean isEmpty(ArrayQueueADT<T> queue) {
        return queue.size == 0;
    }

    public static <T> void clear(ArrayQueueADT<T> queue) {
        for (int i = 0; i < queue.capacity; i++) {
            queue.elements[i] = null;
        }
        queue.size = 0;
        queue.front = 0;
        queue.rear = -1;
    }
}
