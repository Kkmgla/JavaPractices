public class Main {
    public static void main(String[] args) {
        Toy toy = new Toy(4);
        Furniture furniture = new Furniture(12);
        Food food = new Food("Meat");
        System.out.println("Toys's price: " + toy.getPrice());
        System.out.println("Furniture's price: " + furniture.getPrice());
        System.out.println("Food's name: " + food.getName());
    }
}
