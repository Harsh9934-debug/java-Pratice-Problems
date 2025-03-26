import java.awt.event.*;
import javax.swing.*;

public class ButtonClickDemo implements ActionListener {
    private JFrame frame;
    private JButton button;
    private JTextField textField;

    public ButtonClickDemo() {
        // Create GUI components
        frame = new JFrame("Button Click Demo");
        button = new JButton("Click Me");
        textField = new JTextField(20);

        // Add ActionListener to the button
        button.addActionListener(this);

        // Add components to the frame
        frame.setLayout(null); // Using null layout for manual positioning
        frame.add(button);
        frame.add(textField);

        // Set frame properties
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Position components
        textField.setBounds(50, 10, 200, 30);
        button.setBounds(100, 50, 100, 30);

        frame.setVisible(true);
    }

    // Implement the actionPerformed method
    public void actionPerformed(ActionEvent e) {
        textField.setText("Welcome!");
    }

    public static void main(String[] args) {
        new ButtonClickDemo();
    }
}