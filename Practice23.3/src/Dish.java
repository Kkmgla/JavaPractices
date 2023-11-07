public final class Dish implements Item {
    private String name;
    private final static String DEFAULT_NAME = "white plate";
    private int price;
    private final static int DEFAULT_PRICE = 20;
    private String description;
    private final static String DEFAULT_DESCRIPTION = "White glass";
    public Dish(String name, String description){
        this.name = name;
        this.description = description;
        this.price = DEFAULT_PRICE;
    }
    public Dish(String name, String description, int price){
        this.name = name;
        this.description = description;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Desription: " + this.description + ", Price: " + this.price;
    }
}
