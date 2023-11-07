public class MainMinMax  {
    public static void main(String[] args) {
        Integer[] intArray = {5, 3, 8, 1, 2};
        /*
        MinMax<Integer> minMax = new MinMax<>(intArray);

        System.out.println("Min: " + minMax.findMin());
        System.out.println("Max: " + minMax.findMax());
        */
        double num1 = 10;
        double num2 = 5;
        Calculator calculator = new Calculator();
        System.out.println("Sum: " + calculator.sum(num1, num2));
        System.out.println("Multiply: " + calculator.multiply(num1, num2));
        System.out.println("Divide: " + calculator.divide(num1, num2));
        System.out.println("Subtraction: " + calculator.subtraction(num1, num2));
    }
}
