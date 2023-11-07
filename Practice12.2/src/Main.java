import java.lang.String;
import java.util.Queue;
import java.util.*;

public class Main {
    public static void reverse(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        // Перемещаем элементы из очереди в стек
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }

        // Перемещаем элементы из стека обратно в очередь
        while (!stack.isEmpty()) {
            queue.offer(stack.pop());
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
        Queue <Integer> queue1= new LinkedList<>();
        Queue <Integer> queue2= new LinkedList<>();
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
            queue1.offer(intValue1 % 10);
            intValue1 = intValue1/10;
        }
        reverse(queue1);
        for(Integer element : queue1)
        {
            System.out.println(element);
        }

        //Add data to Stack stack2
        int intValue2 = Integer.parseInt(inputString2);
        for (int i = 0; i < inputString2.length(); i++)
        {
            queue2.offer(intValue2 % 10);
            intValue2 = intValue2/10;
        }
        reverse(queue2);
        for(Integer element : queue2)
        {
            System.out.println(element);
        }
        while ((!queue1.isEmpty()) && (!queue2.isEmpty()) && (counter != 106 )){
            if (queue1.peek() == 0 && queue2.peek() == 9)
            {
                int tmp = queue1.peek();
                queue1.poll();
                queue1.offer(tmp);

                tmp = queue2.peek();
                queue2.poll();
                queue1.offer(tmp);
                if (queue1.size() == 2)
                {
                    reverse(queue1);
                }

                counter++;
                System.out.println("first " + counter);
            }
            else if (queue1.peek() == 9 && queue2.peek() == 0) {

                int tmp = queue2.peek();
                queue2.poll();
                queue2.offer(tmp);


                tmp = queue1.peek();
                queue1.poll();
                queue2.offer(tmp);
                if (queue2.size() == 2)
                {
                    reverse(queue2);
                }

                counter++;
                System.out.println("second " + counter);
            }
            else if (queue1.peek() > queue2.peek())
            {
                int tmp = queue1.peek();
                queue1.poll();
                queue1.offer(tmp);

                tmp = queue2.peek();
                queue2.poll();
                queue1.offer(tmp);
                if (queue1.size() == 2)
                {
                    reverse(queue1);
                }

                counter++;
                System.out.println("first " + counter);
            }
            else if (queue1.peek() < queue2.peek())
            {
                int tmp = queue2.peek();
                queue2.poll();
                queue2.offer(tmp);


                tmp = queue1.peek();
                queue1.poll();
                queue2.offer(tmp);
                if (queue2.size() == 2)
                {
                    reverse(queue2);
                }

                counter++;
                System.out.println("second " + counter);
            }

        }
        if (queue1.isEmpty()){
            reverse(queue2);
            for(Integer element : queue2)
            {
                System.out.print(element);
            }
        }
        if (queue2.isEmpty()){
            reverse(queue1);
            for(Integer element : queue1)
            {
                System.out.print(element);
            }
        }
    }
}