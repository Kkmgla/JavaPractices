import java.lang.*;
public class MovableCircle implements Movable{
    protected MovablePoint center;
    protected int radius;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        this.center = new MovablePoint(x,y,xSpeed,ySpeed);
        this.radius = radius;
    }
    //Java понимает что moveUp в теле этой функции относится к MovablePoint
    @Override
    public void moveUp() { center.moveUp(); }
    @Override
    public void moveDown() { center.moveDown(); }
    @Override
    public void moveLeft() { center.moveLeft(); }
    @Override
    public void moveRight() { center.moveRight(); }

    @Override
    public String toString() {
        return "MovableCircle with center " + center + " and radius " + radius;
    }
}
