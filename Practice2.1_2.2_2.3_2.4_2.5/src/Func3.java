public class Func3 {
    public static void main(String[] args) {
        int n = 10;
        double harmonicSum = 0.0;

        for (int i = 1; i <= n; i++) {
            harmonicSum += 1.0 / i;
        }

        System.out.println("Первые " + n + " чисел гармонического ряда:");
        for (int i = 1; i <= n; i++) {
            System.out.println("H_" + i + " = " + 1.0 / i);
        }

        System.out.println("Сумма первых " + n + " чисел гармонического ряда: " + harmonicSum);
    }
}