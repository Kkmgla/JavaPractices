import java.lang.String;
import java.util.*;
import java.util.Deque;

public class Main {
    public static void reverse(Deque<Integer> dequeue) {
        Stack<Integer> stack = new Stack<>();

        // Перемещаем элементы из очереди в стек
        while (!dequeue.isEmpty()) {
            stack.push(dequeue.poll());
        }

        // Перемещаем элементы из стека обратно в очередь
        while (!stack.isEmpty()) {
            dequeue.offer(stack.pop());
        }
    }
    /*
    public static void stack1W(Stack<Integer> stack){
        Stack<Integer> tempStack = new Stack<>();
    }
    public static void stack2W(Stack<Integer> stack){
        Stack<Integer> tempStack = new Stack<>();
    }
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque <Integer> dequeue1= new ArrayDeque<>();
        Deque <Integer> dequeue2= new ArrayDeque<>();
        int counter = 0;

        //Input
        System.out.print("Введите коллоду первого игрока: ");
        String inputString1 = scanner.nextLine();
        System.out.print("Введите коллоду второго игрока: ");
        String inputString2 = scanner.nextLine();
        scanner.close();

        //Length check
        if (inputString1.length()!=inputString2.length()) {
            System.out.println("Ошибка! Длины колод разные.");
            return;
        }

        //Add data to Stack stack1
        int intValue1 = Integer.parseInt(inputString1);
        for (int i = 0; i < inputString1.length(); i++)
        {
            dequeue1.offerFirst(intValue1 % 10);
            intValue1 = intValue1/10;
        }
        for(Integer element : dequeue1)
        {
            System.out.println(element);
        }

        //Add data to Stack stack2
        int intValue2 = Integer.parseInt(inputString2);
        for (int i = 0; i < inputString2.length(); i++)
        {
            dequeue2.offerFirst(intValue2 % 10);
            intValue2 = intValue2/10;
        }
        for(Integer element : dequeue2)
        {
            System.out.println(element);
        }
        while ((!dequeue1.isEmpty()) && (!dequeue2.isEmpty()) && (counter != 106 )){
            if (dequeue1.peekFirst() == 0 && dequeue2.peekFirst() == 9)
            {
                int tmp = dequeue1.peekFirst();
                dequeue1.pollFirst();
                dequeue1.offerLast(tmp);

                tmp = dequeue2.peekFirst();
                dequeue2.pollFirst();
                dequeue1.offerLast(tmp);
                if (dequeue1.size() == 2)
                {
                    reverse(dequeue1);
                }

                counter++;
                System.out.println("first " + counter);
            }
            else if (dequeue1.peekFirst() == 9 && dequeue2.peekFirst() == 0) {

                int tmp = dequeue2.peekFirst();
                dequeue2.pollFirst();
                dequeue2.offerLast(tmp);


                tmp = dequeue1.peekFirst();
                dequeue1.pollFirst();
                dequeue2.offerLast(tmp);
                if (dequeue2.size() == 2)
                {
                    reverse(dequeue2);
                }

                counter++;
                System.out.println("second " + counter);
            }
            else if (dequeue1.peekFirst() > dequeue2.peekFirst())
            {
                int tmp = dequeue1.peekFirst();
                dequeue1.pollFirst();
                dequeue1.offerLast(tmp);

                tmp = dequeue2.peekFirst();
                dequeue2.pollFirst();
                dequeue1.offerLast(tmp);
                if (dequeue1.size() == 2)
                {
                    reverse(dequeue1);
                }

                counter++;
                System.out.println("first " + counter);
            }
            else if (dequeue1.peekFirst() < dequeue2.peekFirst())
            {
                int tmp = dequeue2.peekFirst();
                dequeue2.pollFirst();
                dequeue2.offerLast(tmp);


                tmp = dequeue1.peekFirst();
                dequeue1.pollFirst();
                dequeue2.offerLast(tmp);
                if (dequeue2.size() == 2)
                {
                    reverse(dequeue2);
                }

                counter++;
                System.out.println("second " + counter);
            }

        }

        if (dequeue1.isEmpty()){
            for(Integer element : dequeue2)
            {
                System.out.print(element);
            }
        }
        if (dequeue2.isEmpty()){
            for(Integer element : dequeue1)
            {
                System.out.print(element);
            }
        }
    }
}