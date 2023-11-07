import java.awt.*;

public class Rectangle extends Shape{
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height){
        super(x,y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(color);
        graphics.fillRect(x, y, width, height);
    }
}
