import java.lang.*;
public class TestBall {
    public static void main(String[] args){
        Ball b1 = new Ball("Blue", 3);
        Ball b2 = new Ball("Green", 4);
        Ball b3 = new Ball("Yellow");
        b3.setSize(6);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
