public class Main {
    public static void main(String[] args) {
        Dish spaghetti = new Dish("Spaghetti", "Delicious pasta with tomato sauce", 5);
        Drink coffee = new Drink( "Coffee", "A hot, caffeinated beverage", 10);
        Dish salad = new Dish( "Salad", "Fresh mixed greens with vinaigrette dressing", 15);

        Order order1 = new Order();
        order1.addItem(spaghetti);
        order1.addItem(coffee);

        Order order2 = new Order();
        order2.addItem(salad);
        order2.addItem(coffee);

        TablesOrderManager orderManager = new TablesOrderManager();
        orderManager.placeOrder(order1);
        orderManager.placeOrder(order2);

        System.out.println("Order 1 Total Cost: $" + order1.getTotalPrice());
        System.out.println("Order 2 Total Cost: $" + order2.getTotalPrice());
    }
}