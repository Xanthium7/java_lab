import java.io.*;

class Main {
    public static void main(String[] args) {
        FileReader fr = null;
        int count = 0;

        try {
            fr = new FileReader("cool.txt");
            int i = fr.read();
            while (i != -1) {
                if ((char) i == '\n') {
                    count++;
                }
                i = fr.read();
            }

        } catch (IOException e) {
            System.out.println("File not found");
        }

    }
}
