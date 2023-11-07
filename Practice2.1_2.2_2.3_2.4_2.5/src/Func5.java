public class Func5 {
    public static void main(String[] args) {
        int number = 3;
        long factorial = Fact(number);
        System.out.println("Факториал числа " + number + " равен " + factorial);
    }

    public static long Fact(int n) {
        if (n < 0) {
            throw new IllegalStateException("Факториал определен только для неотрицательных чисел");
        }
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}