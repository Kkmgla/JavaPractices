import MyPack.*;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
import java.util.Scanner.*;

public class MVCPatternDemo extends JFrame {

    public MVCPatternDemo(){
        ElQueue model1 = new ElQueue();
        ElQueueView view1 = new ElQueueView();
        ElQueueController controller1 = new ElQueueController(model1,view1);
        Scanner scanner = new Scanner(System.in);

        String inputString1 = scanner.nextLine();
        String inputString2 = scanner.nextLine();
        String inputInt1 = scanner.nextLine();

        controller1.setElQueueName(inputString1);
        controller1.setElQueueId(inputString2);
        int number = Integer.parseInt(inputInt1);
        controller1.setElQueuePosition(number);

        JFrame frame = new JFrame("YourQueue");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(300,90);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,1));
        panel.setBackground(Color.ORANGE);
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        JLabel jLabel1 = new JLabel("Name of the person in the queue: " + controller1.getElQueueName());
        JLabel jLabel2 = new JLabel("ID number: "+ controller1.getElQueueId());
        String str = Integer.toString(controller1.getElQueuePosition());
        JLabel jLabel3 = new JLabel("Position: " + str);

        jLabel1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        jLabel2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        jLabel3.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        panel.add(jLabel1);
        panel.add(jLabel2);
        panel.add(jLabel3);
        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        MVCPatternDemo mvcPatternDemo = new MVCPatternDemo();
    }
}
