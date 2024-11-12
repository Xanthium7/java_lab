import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class gui {
    static JFrame f;
    static JButton b;

    public static void main(String[] args) {
        f = new JFrame("COOL FRAME");
        b = new JButton("COOOL");
        b.setBounds(50, 50, 100, 30);

        f.add(b);

        f.setLayout(null);
        f.setSize(300, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
