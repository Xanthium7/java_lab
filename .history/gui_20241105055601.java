import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class GUI {
    static JFrame f;
    static JLabel b;

    public static void main(String[] args) {
        // Create the frame
        f = new JFrame("COOL FRAME");

        // Create the label
        b = new JLabel("COOOL");
        b.setBounds(50, 50, 100, 30);

        // Add the label to the frame
        f.add(b);

        // Set the layout manager to null
        f.setLayout(null);

        // Set the frame size
        f.setSize(300, 300);

        // Ensure the frame is visible
        f.setVisible(true);

        // Ensure the program exits when the frame is closed
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}