import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorUI {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");

        // Создаем текстовое поле для вывода результата
        JTextField display = new JTextField(10);
        display.setEditable(false);

        // Создаем панель для кнопок
        JPanel buttonPanel = new JPanel(new GridLayout(4, 4));

        // Создаем массив с названиями кнопок
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
                    String text = display.getText();
                    String command = e.getActionCommand();

                    if (command.equals("C")) {
                        display.setText("");
                    } else if (command.equals("=")) {
                        try {
                            double result = evaluateExpression(text);
                            display.setText(Double.toString(result));
                        } catch (Exception ex) {
                            display.setText("Error");
                        }
                    } else {
                        display.setText(text + command);
                    }
                }
            });
            buttonPanel.add(button);
        }

        // Создаем панель для компоновки текстового поля и панели с кнопками
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(display, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.CENTER);

        frame.add(mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    private static double evaluateExpression(String expression) {
        // Ваш код для вычисления выражения, например, используя RPN
        return 0.0; // Здесь нужно вернуть результат вычисления
    }
}
