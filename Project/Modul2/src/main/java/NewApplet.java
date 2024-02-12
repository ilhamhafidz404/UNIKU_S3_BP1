import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

class NewApplet extends Applet implements ActionListener {
    TextField display;
    Button[] buttons;
    String[] buttonLabels = {
        "7", "8", "9", "/",
        "4", "5", "6", "*",
        "1", "2", "3", "-",
        "0", "C", "=", "+"
    };

    public void init() {
        display = new TextField(12);
        add(display);

        buttons = new Button[buttonLabels.length];
        for (int i = 0; i < buttonLabels.length; i++) {
            buttons[i] = new Button(buttonLabels[i]);
            buttons[i].addActionListener(this);
            add(buttons[i]);
        }
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.equals("C")) {
            display.setText("");
        } else if (command.equals("=")) {
            try {
                String expression = display.getText();
                double result = evaluateExpression(expression);
                display.setText(Double.toString(result));
            } catch (Exception ex) {
                display.setText("Error");
            }
        } else {
            display.setText(display.getText() + command);
        }
    }

    private double evaluateExpression(String expression) {
        // Implement your expression evaluation logic here
        // This is a simple example and may need more work to handle all cases.
        // For simplicity, we will not handle parentheses or operator precedence.
        return Double.parseDouble(expression);
    }
}