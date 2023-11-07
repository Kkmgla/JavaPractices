public class TableOrder implements Order {
    private int size;
    private MenuItem[] items;
    private Customer customer;

    public TableOrder() {
        this.size = 0;
        this.items = new MenuItem[16];
        this.customer = Customer.MATURE_UNKNOWN_CUSTOMER;
    }

    public TableOrder(int initialCapacity, Customer customer) {
        this.size = 0;
        this.items = new MenuItem[initialCapacity];
        this.customer = customer;
    }

    @Override
    public boolean add(MenuItem item) {
        if (size == items.length) {
            MenuItem[] newItems = new MenuItem[items.length * 2];
            System.arraycopy(items, 0, newItems, 0, size);
            items = newItems;
        }

        items[size] = item;
        size++;
        return true;
    }

    @Override
    public String[] itemsNames() {
        String[] names = new String[size];
        for (int i = 0; i < size; i++) {
            names[i] = items[i].getName();
        }
        return names;
    }

    @Override
    public int itemsQuantity() {
        return size;
    }

    @Override
    public int itemQuantity(String itemName) {
        int quantity = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(itemName)) {
                quantity++;
            }
        }
        return quantity;
    }

    @Override
    public int itemQuantity(MenuItem item) {
        int quantity = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].equals(item)) {
                quantity++;
            }
        }
        return quantity;
    }

    @Override
    public MenuItem[] getItems() {
        MenuItem[] orderItems = new MenuItem[size];
        System.arraycopy(items, 0, orderItems, 0, size);
        return orderItems;
    }

    @Override
    public boolean remove(String itemName) {
        for (int i = size - 1; i >= 0; i--) {
            if (items[i].getName().equals(itemName)) {
                for (int j = i; j < size - 1; j++) {
                    items[j] = items[j + 1];
                }
                items[size - 1] = null;
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean remove(MenuItem item) {
        for (int i = size - 1; i >= 0; i--) {
            if (items[i].equals(item)) {
                for (int j = i; j < size - 1; j++) {
                    items[j] = items[j + 1];
                }
                items[size - 1] = null;
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public int removeAll(String itemName) {
        int removedCount = 0;
        for (int i = size - 1; i >= 0; i--) {
            if (items[i].getName().equals(itemName)) {
                for (int j = i; j < size - 1; j++) {
                    items[j] = items[j + 1];
                }
                items[size - 1] = null;
                size--;
                removedCount++;
            }
        }
        return removedCount;
    }

    @Override
    public int removeAll(MenuItem item) {
        int removedCount = 0;
        for (int i = size - 1; i >= 0; i--) {
            if (items[i].equals(item)) {
                for (int j = i; j < size - 1; j++) {
                    items[j] = items[j + 1];
                }
                items[size - 1] = null;
                size--;
                removedCount++;
            }
        }
        return removedCount;
    }

    @Override
    public MenuItem[] sortedItemsByCostDesc() {
        MenuItem[] sortedItems = getItems();
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (sortedItems[j].getCost() < sortedItems[j + 1].getCost()) {
                    MenuItem temp = sortedItems[j];
                    sortedItems[j] = sortedItems[j + 1];
                    sortedItems[j + 1] = temp;
                }
            }
        }
        return sortedItems;
    }

    @Override
    public int costTotal() {
        int totalCost = 0;
        for (int i = 0; i < size; i++) {
            totalCost += items[i].getCost();
        }
        return totalCost;
    }

    @Override
    public Customer getCustomer() {
        return customer;
    }

    @Override
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}