public class TestTask2 {
    public static void main(String[] args) {
        Task2 task2 = new Task2();
        long four = 44444444L;
        task2.add("one");
        task2.add(2);
        task2.add(3.01111111111111111111111111111111111111111111111111111111111D);
        task2.add(four);
        System.out.println(task2.get(2)); //task3
        task2.getElements();
    }
}
