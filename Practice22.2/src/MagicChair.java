public class MagicChair implements Chair{
    private String material;
    private String color;

    public MagicChair(String material, String color){
        this.material = material;
        this.color = color;
    }
    public void doMagic() {
        System.out.println("Yes it does");
    }
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
