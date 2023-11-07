public class параша<T> {
    private int size;
    private int front;
    private int rear;
    private int capacity;
    private T[] elements;

    public static <T> параша<T> create() {
        параша<T> queue = new параша<>();
        queue.capacity = 100;
        queue.size = 0;
        queue.front = 0;
        queue.rear = -1;
        queue.elements = (T[]) new Object[queue.capacity];
        return queue;
    }

    public void enqueue(параша<T> queue, T item) {
        if (queue.size == queue.capacity) {
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }
        queue.rear = (queue.rear + 1) % queue.capacity;
        queue.elements[queue.rear] = item;
        queue.size++;
    }

    public T element(параша<T> queue) {
        if (isEmpty(queue)) {
            System.out.println("Queue is empty. No element to return.");
            return null;
        }
        return queue.elements[queue.front];
    }

    public T dequeue(параша<T> queue) {
        if (isEmpty(queue)) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return null;
        }
        T removedItem = queue.elements[queue.front];
        queue.front = (queue.front + 1) % queue.capacity;
        queue.size--;
        return removedItem;
    }

    public int size(параша<T> queue) {
        return queue.size;
    }

    public boolean isEmpty(параша<T> queue) {
        return queue.size == 0;
    }

    public void clear(параша<T> queue) {
        for (int i = 0; i < queue.capacity; i++) {
            queue.elements[i] = null;
        }
        queue.size = 0;
        queue.front = 0;
        queue.rear = -1;
    }
}
