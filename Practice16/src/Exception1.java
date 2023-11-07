public class Exception1{
    public void exceptionDemo() {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero" + "\n----------------------------------------------------");
        } finally {
            System.out.println("Задание № 4\n" +
                    "Шаг 1. Добавьте блок finally к решению Задания №2. "+ "\n----------------------------------------------------");
        }
    }


    public static void main(String[] args) throws Exception {
        Exception1 exception1 = new Exception1();
        exception1.exceptionDemo();
        Exception2 exception2 = new Exception2();
        exception2.exceptionDemo();
        ThrowsDemo throwsDemo = new ThrowsDemo();
        String key = null;
        throwsDemo.getDetails(key);
        ThrowsDemo2 throwsDemo2 = new ThrowsDemo2();
        throwsDemo2.getKey();
    }
}