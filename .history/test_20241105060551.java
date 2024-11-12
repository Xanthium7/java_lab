import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

class Main implements ActionListener {

    static JFrame f;
    static JButton b;
    static JTextField t1, t2;

    public static void main(String[] args) {

        Main ob = new Main();

        f = new JFrame("COOL FRAME");
        t1 = new JTextField();
        t2 = new JTextField();
        t1.setBounds(50, 50, 150, 20);
        t2.setBounds(50, 100, 150, 20);
        b = new JButton("CLICK ME");
        b.setBounds(75, 150, 95, 30);
        b.addActionListener(this);

        f.setLayout(null);
        f.add(t1);
        f.add(t2);
        f.add(b);
        f.setSize(300, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent e) {

        String s = t1.getText();
        StringTokenizer st = new StringTokenizer(s, " ");

        int n = 0;
        while (st.hasMoreTokens()) {
            n++;
            st.nextToken();
        }
        t2.setText("Number of words: " + n);
    }

}
