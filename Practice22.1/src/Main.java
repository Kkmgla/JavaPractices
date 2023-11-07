public class Main {
    public static void main(String[] args) {
        ConcreteFactory factory = new ConcreteFactory();
        Complex complex1 = factory.createComplex();
        Complex complex2 = factory.createComplex(4,6);
        System.out.println("Complex 1: " + complex1);
        System.out.println("Complex 2: " + complex2);
    }
}
