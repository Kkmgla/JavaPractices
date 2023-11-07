import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Interf  extends JFrame {
    private ArrayList <Shape> shapes = new ArrayList<>();

    public Interf(){
        super("Just a window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,800);
        setLayout(null);
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int randomNumber = random.nextInt(3) +1;

            int x = random.nextInt(getWidth());
            int y = random.nextInt(getHeight());

            if (randomNumber == 1) {
                int width = random.nextInt(100) + 50;
                int height = random.nextInt(100) + 50;
                shapes.add(new Rectangle(x, y, width, height));
            }
            else if(randomNumber == 2) {
                int radius = random.nextInt(50) + 20;
                shapes.add(new Circle(x, y, radius));
            }
            else if(randomNumber == 3) {
                int side = random.nextInt(40) + 30;
                shapes.add(new Square(x,y,side));
            }
        }

    }
    @Override
    public void paint(Graphics graphics) {
        for (Shape shape : shapes) {
            shape.draw(graphics);
        }
    }
    public static void main(String[] args) {
            Interf interf = new Interf();
            interf.setVisible(true);

    }
}
