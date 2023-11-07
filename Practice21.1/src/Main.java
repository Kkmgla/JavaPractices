/**

 Когда очередь реализована как класс с неявной передачей ссылки на экземпляр очереди (как в ArrayQueue), это означает,
 что вы создаете объект класса (в данном случае, очередь) и работаете с этим объектом через его методы.
 По сути, это объектно-ориентированный способ работы с очередью.

 В случае ArrayQueueModule, где используется переменная класса, вы не создаете отдельных объектов очереди.
 Вместо этого у вас есть одна общая очередь, которая разделяется между всеми частями вашей программы,
 и вы обращаетесь к ней напрямую через функции, не создавая объекты.

 Пример:
 В ArrayQueue вы создаете объект очереди и выполняете операции над ним, например:

 ArrayQueue myQueue; // Создание экземпляра очереди
 myQueue.enqueue(42); // Добавление элемента 42 в очередь
 int front = myQueue.element(); // Получение первого элемента (front)
 int removed = myQueue.dequeue(); // Удаление и получение первого элемента (removed)
 int size = myQueue.size(); // Получение размера очереди
 bool empty = myQueue.isEmpty(); // Проверка, является ли очередь пустой
 myQueue.clear(); // Очистка очереди


 В ArrayQueueModule у вас есть общий доступ к одной очереди:

 ArrayQueueModule::enqueue(42); // Добавление элемента 42 в очередь
 int front = ArrayQueueModule::element(); // Получение первого элемента (front)
 int removed = ArrayQueueModule::dequeue(); // Удаление и получение первого элемента (removed)
 int size = ArrayQueueModule::size(); // Получение размера очереди
 bool empty = ArrayQueueModule::isEmpty(); // Проверка, является ли очередь пустой
 ArrayQueueModule::clear(); // Очистка очереди

 Использование статической реализации может быть удобным, если у вас есть общая очередь,
 которую вы хотите использовать в разных частях программы,
 и вам не требуется создавать множество отдельных объектов очереди.

 ArrayQueueADT реализует очередь в виде абстрактного типа данных (АТД).
 Это означает, что он предоставляет интерфейс для работы с очередью,
 но не включает саму структуру данных внутри класса. Вместо этого, он ожидает, что пользователь предоставит конкретную реализацию структуры данных, которая соответствует этому интерфейсу.

 Для этого в ArrayQueueADT используется указатель на структуру данных (класс очереди), который передается через аргументы методов класса. Это позволяет вам использовать ArrayQueueADT с разными реализациями очереди, не привязываясь к конкретной структуре данных.

 Пример:
 ArrayQueueADT queue; // Создание объекта типа ArrayQueueADT
 ArrayQueue queueImplementation; // Создание объекта очереди (конкретная реализация)

 // Использование ArrayQueueADT с конкретной реализацией
 queue.enqueue(queueImplementation, 42); // Добавление элемента в очередь
 int firstElement = queue.element(queueImplementation); // Получение первого элемента

 Это может быть полезным, если вам нужно иметь гибкость
 и возможность использовать разные реализации очереди в зависимости от ваших потребностей.
 */

public  class Main{
    public static void main(String[] args) {

        //ArrayQueue
        ArrayQueue<String> arrayQueue = new ArrayQueue<String>(11);
        arrayQueue.enqueue("Sky"); // Добавляем элемент в очередь
        String firstElement = arrayQueue.element(); // Получаем первый элемент очереди
        System.out.println("Первый элемент: " + firstElement);
        String dequeuedElement = arrayQueue.dequeue(); // Удаляем и получаем первый элемент
        System.out.println("Удален элемент: " + dequeuedElement);
        int size = arrayQueue.size(); // Получаем текущий размер очереди
        System.out.println("Размер очереди: " + size);
        boolean isEmpty = arrayQueue.isEmpty(); // Проверяем, пуста ли очередь
        System.out.println("Очередь пуста: " + isEmpty);
        arrayQueue.clear(); // Очищаем очередь
        isEmpty = arrayQueue.isEmpty(); // Проверяем, пуста ли очередь
        System.out.println("Очередь пуста после очистки: " + isEmpty + "*********************************************************************************");

        //ArrayQueueModule
        ArrayQueueModule.enqueue(1);
        ArrayQueueModule.enqueue(2);
        ArrayQueueModule.enqueue(3);

        // Получение и вывод первого элемента
        System.out.println("Первый элемент: " + ArrayQueueModule.element());
        // Удаление и вывод первого элемента
        System.out.println("Удален элемент: " + ArrayQueueModule.dequeue());
        // Получение размера очереди
        System.out.println("Размер очереди: " + ArrayQueueModule.size());
        // Проверка, является ли очередь пустой
        System.out.println("Очередь пуста: " + ArrayQueueModule.isEmpty());
        // Очистка очереди
        ArrayQueueModule.clear();
        // Проверка после очистки
        System.out.println("Очередь пуста после очистки: " + ArrayQueueModule.isEmpty() + "****************************************************************");

        //ArrayQueueADT
        ArrayQueueADT<Integer> queue = new ArrayQueueADT<>();
        // Добавление элементов в очередь
        for (int i = 1; i <= 5; i++) {
            ArrayQueueADT.enqueue(queue, i);
        }
        // Вывод первого элемента
        System.out.println("Первый элемент: " + ArrayQueueADT.element(queue));
        // Удаление и вывод первого элемента
        System.out.println("Удален элемент: " + (Integer)ArrayQueueADT.dequeue(queue));
        // Получение размера очереди
        System.out.println("Размер очереди: " + ArrayQueueADT.size(queue));
        // Проверка, является ли очередь пустой
        System.out.println("Очередь пуста: " + ArrayQueueADT.isEmpty(queue));
        // Очистка очереди
        ArrayQueueADT.clear(queue);
        // Проверка после очистки
        System.out.println("Очередь пуста после очистки: " + ArrayQueueADT.isEmpty(queue) + "*************************************************************");

        ArrayQueueADT<String> queue1 = new ArrayQueueADT<>();
        // Добавление элементов в очередь
        ArrayQueueADT.enqueue(queue1, "Sky");
        // Вывод первого элемента
        System.out.println("Первый элемент: " + (String)ArrayQueueADT.element(queue1));
        // Удаление и вывод первого элемента
        System.out.println("Удален элемент: " + ArrayQueueADT.dequeue(queue1));
        // Получение размера очереди
        System.out.println("Размер очереди: " + ArrayQueueADT.size(queue1));
        // Проверка, является ли очередь пустой
        System.out.println("Очередь пуста: " + ArrayQueueADT.isEmpty(queue1));
        // Очистка очереди
        ArrayQueueADT.clear(queue1);
        // Проверка после очистки
        System.out.println("Очередь пуста после очистки: " + ArrayQueueADT.isEmpty(queue1));
    }
}