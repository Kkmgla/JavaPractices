import java.util.Scanner;
import java.util.Stack;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Main {
    public Main(){
        RPNTranslatorModel model = new RPNTranslatorModel();
        RPNTranslatorView view = new RPNTranslatorView();
        RPNTranslatorController rpnTranslatorController = new RPNTranslatorController(model,view);

        JFrame frame = new JFrame("RNP Calculator");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        JTextField displayResult = new JTextField(10);
        displayResult.setEditable(false);

        JPanel buttonPanel = new JPanel(new GridLayout(4, 4));
        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "C", "0", "=", "+"
        };

        // Добавляем кнопки на панель
        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    String text = displayResult.getText();
                    String command = e.getActionCommand();

                    if (command.equals("C")) {
                        displayResult.setText("");
                    } else if (command.equals("=")) {
                        try {
                            double result = rpnTranslatorController.RunCalc(text);
                            displayResult.setText(Double.toString(result) + " ");
                        } catch (Exception ex) {
                            displayResult.setText("Error");
                        }
                    } else {
                        displayResult.setText(text + command + " ");
                    }
                }
            });
            buttonPanel.add(button);
        }
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(displayResult, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.CENTER);

        frame.add(mainPanel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Main main = new Main();
    }
}