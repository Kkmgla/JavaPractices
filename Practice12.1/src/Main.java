import java.lang.String;
import java.util.Scanner;
import java.util.Stack;
public class Main {
    public static void reverse(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>();

        // Перемещаем элементы из исходного стека во временный стек
        while (!stack.isEmpty()) {
            tempStack.push(stack.pop());
        }

        // Переключаем временный стек с исходным стеком
        stack.addAll(tempStack);
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
        Stack <Integer> stack1= new Stack<>();
        Stack <Integer> stack2= new Stack<>();
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
            stack1.push(intValue1 % 10);
            intValue1 = intValue1/10;
        }
        /*reverse(stack1);*/
        for(Integer element : stack1)
        {
            System.out.println(element);
        }

        //Add data to Stack stack2
        int intValue2 = Integer.parseInt(inputString2);
        for (int i = 0; i < inputString2.length(); i++)
        {
            stack2.push(intValue2 % 10);
            intValue2 = intValue2/10;
        }
        /*reverse(stack2);*/
        for(Integer element : stack2)
        {
            System.out.println(element);
        }
        while ((!stack1.isEmpty()) && (!stack2.isEmpty()) && (counter != 106 )){
            if (stack1.peek() == 0 && stack2.peek() == 9)
            {
                int tmp = stack1.peek();
                stack1.pop();
                reverse(stack1);
                stack1.push(tmp);
                reverse(stack1);

                tmp = stack2.peek();
                stack2.pop();
                reverse(stack1);
                stack1.push(tmp);
                reverse(stack1);
                if (stack1.size() == 2)
                {
                    reverse(stack1);
                }

                counter++;
                System.out.println("first " + counter);
            }
            else if (stack1.peek() == 9 && stack2.peek() == 0) {
                int tmp = stack2.peek();
                stack2.pop();
                reverse(stack2);
                stack2.push(tmp);
                reverse(stack2);


                tmp = stack1.peek();
                stack1.pop();
                reverse(stack2);
                stack2.push(tmp);
                reverse(stack2);
                if (stack2.size() == 2)
                {
                    reverse(stack2);
                }

                counter++;
                System.out.println("second " + counter);
            }
            else if (stack1.peek() > stack2.peek())
            {

                int tmp = stack1.peek();
                stack1.pop();
                reverse(stack1);
                stack1.push(tmp);
                reverse(stack1);

                tmp = stack2.peek();
                stack2.pop();
                reverse(stack1);
                stack1.push(tmp);
                reverse(stack1);
                if (stack1.size() == 2)
                {
                    reverse(stack1);
                }

                counter++;
                System.out.println("first " + counter);
            }
            else if (stack1.peek() < stack2.peek())
            {
                int tmp = stack2.peek();
                stack2.pop();
                reverse(stack2);
                stack2.push(tmp);
                reverse(stack2);


                tmp = stack1.peek();
                stack1.pop();
                reverse(stack2);
                stack2.push(tmp);
                reverse(stack2);
                if (stack2.size() == 2)
                {
                    reverse(stack2);
                }


                counter++;
                System.out.println("second " + counter);

            }

        }
        if (stack1.isEmpty()){
            reverse(stack2);
            for(Integer element : stack2)
            {
                System.out.print(element);
            }
        }
        if (stack2.isEmpty()){
            reverse(stack1);
            for(Integer element : stack1)
            {
                System.out.print(element);
            }
        }
    }
}