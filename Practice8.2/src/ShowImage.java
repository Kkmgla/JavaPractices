import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;//загрузка изображения из файла
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
public class ShowImage extends JFrame {
    private BufferedImage image;
    public ShowImage(String imagePath) {
        try {
            image = ImageIO.read(new File(imagePath));
            setSize(image.getWidth(), image.getHeight());
            setTitle("Just a pic");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(null);
        }
        catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Не удалось загрузить изображение.", "Ошибка", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
    }
    public void paint(Graphics graphics) {
        graphics.drawImage(image, 0, 0, this);
    }
    public static void main(String[] args) {
        ShowImage app = new ShowImage("E:\\JavaProjects\\JavaProg\\Practice8.2\\PicForApp.jpg");
        app.setVisible(true);
    }
}