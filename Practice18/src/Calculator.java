public class Calculator {
    public <T extends Number> T sum(T a, T b) {
        if (a instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() + b.doubleValue());
        } else if (a instanceof Float) {
            return (T) Float.valueOf(a.floatValue() + b.floatValue());
        } else if (a instanceof Long) {
            return (T) Long.valueOf(a.longValue() + b.longValue());
        } else if (a instanceof Integer){
            return (T) Integer.valueOf(a.intValue() + b.intValue());
        } else {
            throw new IllegalArgumentException("Неподдерживаемый тип данных");
        }
    };
    public <T extends Number> T subtraction(T a, T b){
        if (a instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() - b.doubleValue());
        } else if (a instanceof Float) {
            return (T) Float.valueOf(a.floatValue() - b.floatValue());
        } else if (a instanceof Long) {
            return (T) Long.valueOf(a.longValue() - b.longValue());
        } else if (a instanceof Integer){
            return (T) Integer.valueOf(a.intValue() - b.intValue());
        } else {
            throw new IllegalArgumentException("Неподдерживаемый тип данных");
        }
    }

    public <T extends Number> T multiply(T a, T b){
        if (a instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() * b.doubleValue());
        } else if (a instanceof Float) {
            return (T) Float.valueOf(a.floatValue() * b.floatValue());
        } else if (a instanceof Long) {
            return (T) Long.valueOf(a.longValue() * b.longValue());
        } else if (a instanceof Integer){
            return (T) Integer.valueOf(a.intValue() * b.intValue());
        } else {
            throw new IllegalArgumentException("Неподдерживаемый тип данных");
        }
    }
    public <T extends Number> T divide(T a, T b){
        if (a instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() / b.doubleValue());
        } else if (a instanceof Float) {
            return (T) Float.valueOf(a.floatValue() / b.floatValue());
        } else if (a instanceof Long) {
            return (T) Long.valueOf(a.longValue() / b.longValue());
        } else if (a instanceof Integer){
            return (T) Integer.valueOf(a.intValue() / b.intValue());
        } else {
            throw new IllegalArgumentException("Неподдерживаемый тип данных");
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 1;
        int b = 2;
        System.out.println("Sum of a and b:" + calculator.sum(a,b));
        System.out.println("Sub of a and b:" + calculator.subtraction(a,b));
        System.out.println("Div of a and b:" + calculator.divide(a,b));
        System.out.println("Mult of a and b:" + calculator.multiply(a,b));
        double c = 7.5;
        double d = 85.4;
        System.out.println("Sum of c and d:" + calculator.sum(c,d));
        System.out.println("Sub of c and d:" + calculator.subtraction(c,d));
        System.out.println("Div of c and d:" + calculator.divide(c,d));
        System.out.println("Mult of c and d:" + calculator.multiply(c,d));
    }
}
