
public class Main {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(2,3,0,0);
        MovableCircle circle = new MovableCircle(4,5, 0,0, 2);
        MovableRectangle rectangle = new MovableRectangle(1,2,3,4,0,0);

        System.out.println(point);
        point.moveRight();
        System.out.println(point + "\n");

        System.out.println(circle);
        circle.moveUp();
        System.out.println(circle + "\n");

        System.out.println(rectangle);
        rectangle.moveUp();
        System.out.println(rectangle + "\n");
    }
}