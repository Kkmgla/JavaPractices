import java.util.ArrayList;
import java.util.List;

class TableOrdersManager implements OrdersManager {
    private List<Order> orders = new ArrayList<>();

    public void add(Order order, int tableNumber) {
        if (tableNumber >= 0 && tableNumber < orders.size()) {
            orders.set(tableNumber, order);
        }
    }

    public void addItem(MenuItem item, int tableNumber) {
        if (tableNumber >= 0 && tableNumber < orders.size() && orders.get(tableNumber) != null) {
            orders.get(tableNumber).add(item);
        }
    }

    public int freeTableNumber() {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i) == null) {
                return i;
            }
        }
        return -1; // No free tables available
    }

    public int[] freeTableNumbers() {
        List<Integer> freeTables = new ArrayList<>();
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i) == null) {
                freeTables.add(i);
            }
        }
        int[] result = new int[freeTables.size()];
        for (int i = 0; i < freeTables.size(); i++) {
            result[i] = freeTables.get(i);
        }
        return result;
    }

    public Order getOrder(int tableNumber) {
        if (tableNumber >= 0 && tableNumber < orders.size()) {
            return orders.get(tableNumber);
        }
        return null;
    }

    public void remove(int tableNumber) {
        if (tableNumber >= 0 && tableNumber < orders.size()) {
            orders.set(tableNumber, null);
        }
    }

    public int remove(Order order) {
        int removedCount = 0;
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i) == order) {
                orders.set(i, null);
                removedCount++;
            }
        }
        return removedCount;
    }

    public int removeAll(Order order) {
        int removedCount = 0;
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i) == order) {
                orders.set(i, null);
                removedCount++;
            }
        }
        return removedCount;
    }

    public int itemsQuantity(String itemName) {
        int totalQuantity = 0;
        for (Order order : orders) {
            if (order != null) {
                totalQuantity += order.itemQuantity(itemName);
            }
        }
        return totalQuantity;
    }

    public int itemsQuantity(MenuItem item) {
        int totalQuantity = 0;
        for (Order order : orders) {
            if (order != null) {
                totalQuantity += order.itemQuantity(item);
            }
        }
        return totalQuantity;
    }

    public Order[] getOrders() {
        return orders.toArray(new Order[0]);
    }

    public int ordersCostSummary() {
        int totalCost = 0;
        for (Order order : orders) {
            if (order != null) {
                totalCost += order.costTotal();
            }
        }
        return totalCost;
    }

    public int ordersQuantity() {
        int totalQuantity = 0;
        for (Order order : orders) {
            if (order != null) {
                totalQuantity++;
            }
        }
        return totalQuantity;
    }
}