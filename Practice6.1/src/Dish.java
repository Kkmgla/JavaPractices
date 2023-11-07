public abstract class Dish {
    protected String color,material;
    public Dish(String color, String material){
        this.color = color;
        this.material = material;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public String getMaterial() {
        return material;
    }
    @Override
    public String toString() {
        return "This dish material: " + this.material + ", color" + this.color;
    }

    public static void main(String[] args) {
        Plate plate = new Plate("Red","Glass",5);
        System.out.println(plate);
        Cup cup = new Cup("Blue", "Wood", 7, 5);
        System.out.println(cup);
    }
}

