import java.awt.*;
import java.lang.*;
import java.util.Random;
public abstract class Shape {
    protected Color color;
    protected int x,y;
    public Shape(int x, int y){
        this.x = x;
        this.y = y;
        this.color = getRandomColor();
    }
    public abstract void draw(Graphics graphics);
    public Color getRandomColor() {
        Random random = new Random();
        return new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
    }
}
