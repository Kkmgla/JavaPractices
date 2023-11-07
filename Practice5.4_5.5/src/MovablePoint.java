import java.lang.*;
public class MovablePoint implements Movable{
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;
    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public void moveUp() { y++; }
    public void moveDown() { y--; }
    public void moveLeft() { x--; }
    public void moveRight() { x++; }

    public String toString() {
        return "MovablePoint at (" + x + ", " + y + ")";
    }
}