import java.lang.*;
public abstract class Shape {
    protected String color;
    protected boolean filled;
    public Shape(){}
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public boolean isFilled() { return filled; }
    public void setFilled(boolean filled) { this.filled = filled; }
    abstract double getArea();
    abstract double getPerimeter();
    public String toString(){
        return "Color is " + this.color + ",(" + this.filled +")";
    }


    public static void main(String[] args) {
        Circle c1 = new Circle(3, "Red", true);
        Rectangle r1 = new Rectangle(10,5,"Yellow", false);
        Square s1 = new Square(10, "Green",true);
        System.out.println(c1.getColor() + "\n");//для теста
        System.out.println(c1+"\n");
        System.out.println(r1+"\n");
        System.out.println(s1+"\n");
    }

}
