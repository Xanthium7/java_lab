import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Main {
    static JFrame f;
    static JButton b;
    static JTextField t;

    public static void main(String[] args) {
        f = new JFrame("COOL FRAME");
        t = new JTextField();
        t.setBounds(50, 50, 150, 20);
        b = new JButton("CLICK ME");
        b.setBounds(75, 100, 95, 30);

        f.setLayout(null);
        f.add(t);
        f.add(b);
        f.setSize(300, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
