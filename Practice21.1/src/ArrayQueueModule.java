/*вы не сможете реализовать "Класс ArrayQueueModule должен реализовывать один экземпляр очереди
 с использованием переменных класса" с использованием дженериков (diamond notation) в Java.
 Дженерики позволяют создавать обобщенные классы и методы, которые могут работать с разными типами данных.
  Однако, они также требуют создания экземпляра класса с указанием конкретного типа данных в момент создания объекта.
Если вы хотите, чтобы ваш класс ArrayQueueModule мог работать с разными типами данных (поддерживать дженерики),
 то вам придется создавать экземпляры класса с указанием конкретных типов данных в момент создания. Например:
 ArrayQueueModule<Integer> integerQueue = new ArrayQueueModule<>();
ArrayQueueModule<String> stringQueue = new ArrayQueueModule<>();

*/
public class ArrayQueueModule {
    private static int front = 0;
    private static int rear = -1;
    private static int size = 0;
    private static int capacity = 100;
    private static Integer[] elements = new Integer[capacity];

    // Добавление элемента в очередь.
    public static void enqueue(int t) {
        if (size == capacity) {
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }

        rear = (rear + 1);
        elements[rear] = t;
        size++;
    }

    // Возвращение первого элемента в очереди.
    public static int element() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No element to return.");
            return 0;
        }
        return elements[front];
    }

    // Удаление и возвращение первого элемента в очереди.
    public static int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return 0;
        }

        int removedItem = elements[front];
        front = (front + 1);
        size--;
        return removedItem;
    }

    // Получение текущего размера очереди.
    public static int size() {
        return size;
    }

    // Проверка, является ли очередь пустой.
    public static boolean isEmpty() {
        return size == 0;
    }

    // Удаление всех элементов из очереди.
    public static void clear() {
        for (int i = 0; i < capacity; i++) {
            elements[i] = null;
        }
        size = 0;
        front = 0;
        rear = -1;
    }
}
