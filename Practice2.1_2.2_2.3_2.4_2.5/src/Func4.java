import static java.util.Arrays.sort;
import java.util.Arrays;
import java.util.Random;

public class Func4 {
    public static void main(String[] args) {
        int[] randomArray = generateRandomArray(10, 1, 100); // 10 элементов от 1 до 100
        System.out.println("Исходный массив:");
        printArray(randomArray);
        sort(randomArray);
        System.out.println("Отсортированный массив:");
        printArray(randomArray);
    }
    public static int[] generateRandomArray(int length, int minValue, int maxValue) {
        int[] arr = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt(maxValue - minValue + 1) + minValue;
        }

        return arr;
    }
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}