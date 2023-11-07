import java.util.NoSuchElementException;

public class LinkedQueue<T>extends AbstractQueue<T> implements Queue<T> {
    public class Node<T>{
        T data;
        Node<T> next;
        Node(T data){
            this.data = data;
            this.next = null;
        }
    }
    private int size = 0;
    private Node<T> front;
    private Node<T> rear;
    // Добавление элемента в очередь.
    public void enqueue(T item){
        Node<T> newNode = new Node<T>(item);
        if (isEmpty()){
            front = newNode;
            rear = newNode;
        }
        else{
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    };
    // Удаление и возвращение первого элемента в очереди.
    public T dequeue(){
        if (isEmpty()){
            throw new NoSuchElementException("Queue is empty");
        }
        else{
            size--;
            T item = front.data;
            front.next = front;
            if (isEmpty()){
                rear = null;
            }
            return item;
        }
    }
    // Возвращение первого элемента в очереди.
    public T peek(){
        if (isEmpty()){
            throw new NoSuchElementException("Queue is empty!");
        }
        else return front.data;
    };
    // Получение текущего размера очереди.
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
    // Удаление всех элементов из очереди.
    public void clear() {
        front = null;
        rear = null;
        size = 0;
    }
}