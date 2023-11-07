public class Circle extends Shape {
    private double radius;
    public Circle(){};
    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }
    @Override
    double getArea() {
        return (Math.PI) * Math.pow((this.radius),2);
    }
    @Override
    double getPerimeter() {
        return (Math.PI) * 2 * this.radius;
    }
    @Override
    public String toString() {
        if (filled){
            return "Radius of this circle is " + this.radius +
                    "\nColor of this circle is " + this.color +
                    "\n This circle is not filled" +
                    "\n Area of this circle is " + getArea() +
                    "\n Perimetr of this circle is " + getPerimeter();
        }
        else {
            return "Radius of this circle is " + this.radius +
                    "\nColor of this circle is " + this.color +
                    "\n This circle is filled" +
                    "\n Area of this circle is " + getArea() +
                    "\n Perimetr of this circle is " + getPerimeter();
        }
    }
}
