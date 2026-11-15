package small_java_Project;



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame {

    JTextField display;
    double num1, num2, result;
    String operator = "";

    Calculator() {

        setTitle("My Java Calculator");
        setSize(350, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        display = new JTextField();
        display.setFont(new Font("Arial", Font.BOLD, 25));
        display.setEditable(false);

        add(display, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 5, 5));

        String buttons[] = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "C", "0", "=", "+"
        };

        for (String text : buttons) {

            JButton btn = new JButton(text);
            btn.setFont(new Font("Arial", Font.BOLD, 20));

            panel.add(btn);

            btn.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {

                    String value = btn.getText();

                    if (value.matches("[0-9]")) {
                        display.setText(display.getText() + value);
                    }

                    else if (value.equals("C")) {
                        display.setText("");
                        num1 = 0;
                        num2 = 0;
                        operator = "";
                    }

                    else if (value.equals("=")) {
                        num2 = Double.parseDouble(display.getText());

                        switch (operator) {
                            case "+":
                                result = num1 + num2;
                                break;
                            case "-":
                                result = num1 - num2;
                                break;
                            case "*":
                                result = num1 * num2;
                                break;
                            case "/":
                                if (num2 == 0) {
                                    display.setText("Cannot divide by zero");
                                    return;
                                }
                                result = num1 / num2;
                                break;
                        }

                        display.setText(String.valueOf(result));
                    }

                    else {
                        num1 = Double.parseDouble(display.getText());
                        operator = value;
                        display.setText("");
                    }
                }
            });
        }

        add(panel, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
