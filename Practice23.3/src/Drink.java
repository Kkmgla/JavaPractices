public final class Drink implements Item {
    private String name;
    private final static String DEFAULT_NAME = "beer";
    private int price;
    private final static int DEFAULT_PRICE = 10;
    private String description;
    private final static String DEFAULT_DESCRIPTION = "Beautiful drink...";
    public Drink(String name, String description){
        this.name = name;
        this.description = description;
        this.price = DEFAULT_PRICE;
    }
    public Drink(String name, String description, int price){
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
