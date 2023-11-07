import java.util.NoSuchElementException;

public abstract class AbstractQueue<T> {
    private int front;
    private int rear;
    private int size;
    private T[] elements;
    private int capacity;

    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }
}
