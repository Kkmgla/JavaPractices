import javax.net.ssl.SSLEngine;

public class Rectangle extends Shape {
    private double width;
    private double length;
    public Rectangle(){}
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }
    public double getWidth() { return width; }
    public double getLength() { return length; }
    public void setWidth(double width) { this.width = width; }
    public void setLength(double length) { this.length = length; }
    @Override
    public double getArea()
    { return (length * width); }
    @Override
    public double getPerimeter()
    { return ((length + width)*2); }
    @Override
    public String toString() {
        if (filled) {
            return "Length of this rectangle is " + this.length +
                    "\nWidth of this rectangle is " + this.width +
                    "\nColor of this rectangle is " + this.color +
                    "\n This rectangle is filled" +
                    "\n Area of this rectangle is " + getArea() +
                    "\n Perimetr of this rectangle is " + getPerimeter();
        }
        else{
            return "Length of this rectangle is " + this.length +
                    "\nWidth of this rectangle is " + this.width +
                    "\nColor of this rectangle is " + this.color +
                    "\n This rectangle is not filled" +
                    "\n Area of this rectangle is " + getArea() +
                    "\n Perimetr of this rectangle is " + getPerimeter();
        }
    }
}
