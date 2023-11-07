public class Plate extends Dish{
    private int radius;
    public Plate(String color, String material, int radius){
        super(color,material);
        this.radius = radius;
    }
    @Override
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String getColor() {
        return color;
    }
    @Override
    public void setMaterial(String material) {
        this.material = material;
    }
    @Override
    public String getMaterial() {
        return material;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "This plate material: " + this.material + ", color " + this.color + " radius " + this.radius;
    }
}
