public class VictorianChair implements Chair{
    private String material;
    private String color;
    private int age;

    public VictorianChair(String material, String color, int age){
        this.material = material;
        this.color = color;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
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
        return "Material " + this.material + ", Color " + this.color + ", Age " + this.age;
    }
}
