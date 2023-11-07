import java.io.Serializable;
import java.util.*;
class Dog extends Animal implements Serializable {}

public class Main {
    public static void main(String[] args) {
        MyClass<Integer, Dog, Integer> myClass = new MyClass<>(1, new Dog(), 42);
        Integer firstParam = myClass.getDataType();
        Dog secondParam = myClass.getDataValue();
        Integer thirdParam = myClass.getDataKey();

        System.out.println("First Parameter: " + firstParam);
        System.out.println("Second Parameter: " + secondParam);
        System.out.println("Third Parameter: " + thirdParam);
        System.out.println();
        myClass.toString();

        double num1 = 10;
        double num2 = 5;
        Calculator calculator = new Calculator();
        System.out.println("Sum: " + calculator.sum(num1, num2));
        System.out.println("Multiply: " + calculator.multiply(num1, num2));
        System.out.println("Divide: " + calculator.divide(num1, num2));
        System.out.println("Subtraction: " + calculator.subtraction(num1, num2));
    }
}