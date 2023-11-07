// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Drink drink1 = new Drink("Rum", "idk1");
        Drink drink2 = new Drink("Liker", "idk2", 77);
        System.out.println("Drink 1 Name: " + drink1.getName());
        System.out.println("Drink 1 Cost: " + drink1.getPrice());
        System.out.println("Drink 1 Description: " + drink1.getDescription());

        System.out.println("Drink 2 Name: " + drink2.getName());
        System.out.println("Drink 2 Cost: " + drink2.getPrice());
        System.out.println("Drink 2 Description: " + drink2.getDescription());
    }
}