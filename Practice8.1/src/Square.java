import java.awt.*;
class Square extends Shape {
    private int side;
    public Square(int x, int y, int side) {
        super(x, y);
        this.side = side;
    }
    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, side, side);
    }
}