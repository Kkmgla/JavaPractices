public class Func1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) sum += numbers[i];
        System.out.println("Сумма чисел в массиве (for): " + sum);
        sum = 0;

        int i = 0;
        while (i < numbers.length) {
            sum += numbers[i];
            i++;
        }
        System.out.println("Сумма чисел в массиве (while): " + sum);
        sum = 0;
        i = 0;

        do {
            sum += numbers[i];
            i++;
        } while (i < numbers.length);
        System.out.println("Сумма чисел в массиве (do-while): " + sum);
    }
}
