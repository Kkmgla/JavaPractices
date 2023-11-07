import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
public class Animation extends JFrame implements ActionListener{
    private ArrayList<BufferedImage> frames = new ArrayList<>();
    private int ThisFrameIndex;
    private Timer timer = new Timer(1000, this);
    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        Image thisFrame = frames.get(ThisFrameIndex);
        graphics.drawImage(thisFrame,0,0,this);
    }
    public void actionPerformed(ActionEvent e) {
        ThisFrameIndex++;
        if (ThisFrameIndex >= frames.size()) {
            ThisFrameIndex = 0;//Зацикливаем анимацию
        }
        repaint();
    }
    public Animation(){
        setTitle("Animation");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(2560, 1440);
        try{
            BufferedImage image0 = ImageIO.read(new File("E:\\JavaProjects\\JavaProg\\Practice8.3\\Pic1.jpg"));
            BufferedImage image1 = ImageIO.read(new File("E:\\JavaProjects\\JavaProg\\Practice8.3\\Pic2.jpg"));
            BufferedImage image2 = ImageIO.read(new File("E:\\JavaProjects\\JavaProg\\Practice8.3\\Pic3.jpg"));
            frames.add(image0);
            frames.add(image1);
            frames.add(image2);
            ThisFrameIndex = 0;
            timer.start();
        }
        catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Не удалось загрузить изображение.", "Ошибка", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
    }
    public static void main(String[] args) {
        Animation animation = new Animation();
        animation.setVisible(true);
    }
}
