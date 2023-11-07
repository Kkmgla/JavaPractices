import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        printOddNumbers();
    }

    public static void printOddNumbers() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();

        if (input.equals("0")) {
            return; // Завершаем рекурсию при вводе 0
        }

        int number = Integer.parseInt(input);

        if (number % 2 != 0) {
            System.out.println(number); // Выводим нечетное число
        }

        printOddNumbers(); // Рекурсивно вызываем функцию для следующего числа
    }
}
