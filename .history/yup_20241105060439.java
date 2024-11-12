import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

class Main {
    static JFrame f;
    static JButton b;
    static JTextField t1, t2;

    public static void main(String[] args) {
        f = new JFrame("COOL FRAME");
        b = new JButton("CLICK ME");

        f.setLayout(null);
        f.add(b);
        f.setSize(300, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}