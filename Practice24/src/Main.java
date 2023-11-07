public class Main {
    public static void main(String[] args) {
        Drink drink1 = new Drink(5, "Cola", "Refreshing cola drink", 0.0, DrinkTypeEnum.SODA);
        Dish dish1 = new Dish(10, "Burger", "Delicious burger with cheese");

        TableOrder tableOrder1 = new TableOrder();

        tableOrder1.add(dish1);
        tableOrder1.add(drink1);

        System.out.println("Table Order:");
        printOrderInfo(tableOrder1);

        String itemToRemove1 = "Cola";
        tableOrder1.remove(itemToRemove1);

        System.out.println("Table Order after removing " + itemToRemove1 + ":");
        printOrderInfo(tableOrder1);


        Drink drink2 = new Drink(7, "Beer", "Tasty cold beer", 5.5, DrinkTypeEnum.BEER);
        Dish dish2 = new Dish(14, "Pizza", "Amazing cheezy pizza");

        InternetOrder internetOrder1 = new InternetOrder();

        internetOrder1.add(dish2);
        internetOrder1.add(drink2);

        System.out.println("Internet Order:");
        printOrderInfo(internetOrder1);

        String itemToRemove2 = "Beer";
        tableOrder1.remove(itemToRemove2);

        System.out.println("Table Order after removing " + itemToRemove2 + ":");
        printOrderInfo(internetOrder1);
    }

    public static void printOrderInfo(Order order) {
        System.out.println("Order Items:");
        for (MenuItem item : order.getItems()) {
            System.out.println(item.getName() + " - " + item.getCost());
        }
        System.out.println("Total Cost: " + order.costTotal());
        System.out.println("Items Quantity: " + order.itemsQuantity());
        System.out.println("Customer: " + order.getCustomer().getFirstName());
        System.out.println();
    }
}