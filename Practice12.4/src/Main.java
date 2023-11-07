import java.lang.String;
import java.util.*;
import java.util.Deque;

public class Main {
    public static void reverse(DoubleLinkedList<Integer> DLL) {
        Stack<Integer> stack = new Stack<>();

        // Перемещаем элементы из очереди в стек
        while (!DLL.isEmpty()) {
            stack.push(DLL.removeLast());
        }

        // Перемещаем элементы из стека обратно в очередь
        while (!stack.isEmpty()) {
            DLL.addFirst(stack.pop());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoubleLinkedList<Integer> DLL1 = new DoubleLinkedList<>();
        DoubleLinkedList<Integer> DLL2 = new DoubleLinkedList<>();
        int counter = 0;

        //Input
        System.out.print("Введите коллоду первого игрока: ");
        String inputString1 = scanner.nextLine();
        System.out.print("Введите коллоду второго игрока: ");
        String inputString2 = scanner.nextLine();
        scanner.close();

        //Length check
        if (inputString1.length() != inputString2.length()) {
            System.out.println("Ошибка! Длины колод разные.");
            return;
        }
        int intValue1 = Integer.parseInt(inputString1);
        for (int i = 0; i < inputString1.length(); i++) {
            DLL1.addFirst(intValue1 % 10);
            intValue1 = intValue1 / 10;
        }
        DLL1.printList();

        int intValue2 = Integer.parseInt(inputString2);
        for (int i = 0; i < inputString2.length(); i++) {
            DLL2.addFirst(intValue2 % 10);
            intValue2 = intValue2 / 10;
        }
        DLL2.printList();

        while ((!DLL1.isEmpty()) && (!DLL2.isEmpty()) && (counter != 106)) {
            if (DLL1.getFirst() == 0 && DLL2.getFirst() == 9) {
                int tmp = DLL1.getFirst();
                DLL1.removeFirst();
                DLL1.addLast(tmp);

                tmp = DLL2.getFirst();
                DLL2.removeFirst();
                DLL1.addLast(tmp);
                if (DLL1.size() == 2) {
                    reverse(DLL1);
                }

                counter++;
                System.out.println("first " + counter);
            } else if (DLL1.getFirst() == 9 && DLL2.getFirst() == 0) {

                int tmp = DLL2.getFirst();
                DLL2.removeFirst();
                DLL2.addLast(tmp);


                tmp = DLL1.getFirst();
                DLL1.removeFirst();
                DLL2.addLast(tmp);
                if (DLL2.size() == 2) {
                    reverse(DLL2);
                }

                counter++;
                System.out.println("second " + counter);
            } else if (DLL1.getFirst() > DLL2.getFirst()) {
                int tmp = DLL1.getFirst();
                DLL1.removeFirst();
                DLL1.addLast(tmp);

                tmp = DLL2.getFirst();
                DLL2.removeFirst();
                DLL1.addLast(tmp);
                if (DLL1.size() == 2) {
                    reverse(DLL1);
                }

                counter++;
                System.out.println("first " + counter);
            } else if (DLL1.getFirst() < DLL2.getFirst()) {
                int tmp = DLL2.getFirst();
                DLL2.removeFirst();
                DLL2.addLast(tmp);
                tmp = DLL1.getFirst();
                DLL1.removeFirst();
                DLL2.addLast(tmp);
                if (DLL2.size() == 2) {
                    reverse(DLL2);
                }
                counter++;
                System.out.println("second " + counter);
            }
            if (DLL1.isEmpty()) {
                DLL2.printList();
            }
            if (DLL2.isEmpty()) {
                DLL1.printList();
            }
        }
    }
}