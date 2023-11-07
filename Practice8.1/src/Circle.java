import java.awt.*;
public class Circle extends Shape{
    public int radius;
    public Circle(int x, int y, int radius){
        super(x,y);
        this.radius = radius;
    }
    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(color);
        graphics.fillOval(x, y, 2 * radius, 2 * radius);
    }
}
