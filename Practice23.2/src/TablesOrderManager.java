import java.util.ArrayList;

public class TablesOrderManager {
    private ArrayList<Order> orders = new ArrayList<>();
    public void placeOrder(Order order) {
        orders.add(order);
    }
    public void removeOrder(Order order) {
        orders.remove(order);
    }
}
