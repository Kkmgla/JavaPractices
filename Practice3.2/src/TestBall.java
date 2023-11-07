import java.lang.*;
public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(5, 15);
        System.out.println(b1);
        b1.move(20, 10);
        System.out.println(b1);
    }
}