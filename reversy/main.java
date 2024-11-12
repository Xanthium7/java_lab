package reversy;

import java.io.*;

class Main {
    public static void main(String[] args) {

        FileReader fr = null;
        PrintWriter pw = null;
        String s = "";
        try {
            fr = new FileReader("reversy/test.txt");
            pw = new PrintWriter("reversy/output.txt");

            int c = fr.read();
            while (c != -1) {
                s = (char) c + s;
                c = fr.read();
            }
            pw.println(s);

            fr.close();
            pw.close();

        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(s);

    }
}
