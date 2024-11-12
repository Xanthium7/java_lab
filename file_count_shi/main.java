package file_count_shi;

import java.io.*;

class Main {
    public static void main(String[] args) {
        BufferedReader br = null;
        int c = 1, w = 1, l = 1;
        try {
            br = new BufferedReader(new FileReader("file_count_shi/test.txt"));
            int x = br.read();
            while (x != -1) {
                if ((char) x == ' ') {
                    w++;
                } else if ((char) x == '\n') {
                    l++;
                    w++;
                } else {
                    c++;
                }

                x = br.read();
            }

            br.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Characters: " + c);
        System.out.println("Words: " + w);
        System.out.println("Lines: " + l);

    }

}
