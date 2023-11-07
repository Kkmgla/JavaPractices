public class FunctionalChair implements Chair{
    private String material;
    private String color;

    public FunctionalChair(String material, String color){
        this.material = material;
        this.color = color;
    }
    public int sum(int a,int b){ return a + b;};
    public void setMaterial(String color){this.color = color;}
    public void setColor(String material){this.material = material;}
    public String getMaterial() {
        return material;
    }
    public String getColor() {
        return color;
    }
    public String toString() {
        return "Material " + this.material + ", Color " + this.color;
    }
}