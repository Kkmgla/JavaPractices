/*ArrayQueue:
Это класс, который реализует очередь в виде класса (с неявной передачей ссылки на экземпляр очереди).
Поля, такие как front, rear, size, capacity и elements, принадлежат конкретному экземпляру класса.
То есть каждый экземпляр класса имеет свои собственные значения для этих полей, и они индивидуальны для каждого экземпляра.
Экземпляр этого класса создается и используется как объект.

ArrayQueueADT:
Это класс, который реализует очередь в виде абстрактного типа данных (с явной передачей ссылки на экземпляр очереди).
Не создает экземпляр класса для использования, а вместо этого работает с абстрактными функциями,
которые принимают ссылку на экземпляр очереди в качестве одного из параметров.
Это позволяет внешнему коду управлять экземпляром очереди и передавать его в методы этого класса.

Основное отличие заключается в том, что ArrayQueue - это реализация очереди в виде конкретного класса
 с инкапсулированными данными, в то время как ArrayQueueADT - это реализация операций с очередью
  в виде набора абстрактных функций, которые манипулируют данными, переданными им в параметрах.
 */
public class ArrayQueue<T> {
    private int front;
    private int rear;
    private int size;
    private T[] elements;
    private int capacity;

    // Конструктор класса, инициализирует пустую очередь.
    public ArrayQueue(int capacity){
        this.size = 0;
        this.front = 0;
        this.rear = -1;
        this.elements = (T[]) new Object[capacity];
        this.capacity = capacity;
    };

    // Добавление элемента в очередь.
    public void enqueue(T t){
        if (size == capacity) {
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }

        rear = (rear + 1);
        elements[rear] = t;
        size++;
    };

    // Возвращение первого элемента в очереди.
    public T element() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No element to return.");
            return null;
        }

        return elements[front];
    }

    // Удаление и возвращение первого элемента в очереди.
    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return null;
        }

        T removedItem = elements[front];
        front = (front + 1);
        size--;
        return removedItem;
    }

    // Получение текущего размера очереди.
    public int size(){
        return size;
    };

    // Проверка, является ли очередь пустой.
    public boolean isEmpty(){
        return size == 0;
    };

    // Удаление всех элементов из очереди.
    public void clear(){
        for (int i = 0; i < capacity; i++) {
            elements[i] = null;
        }
        size = 0;
        front = 0;
        rear = -1;
    };
}
