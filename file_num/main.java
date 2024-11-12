package file_num;

import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        // Read n integers from the console
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // Write the numbers to a file
        PrintWriter pw = null;
        try {
            pw = new PrintWriter("file_num/numbers.txt");
            for (int num : numbers) {
                pw.print(num);

            }
            pw.close();
        } catch (Exception e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
        String s = "";
        // Read the numbers from the file
        FileReader fr = null;
        try {
            fr = new FileReader("file_num/numbers.txt");
            int c = fr.read();
            while (c != -1) {
                if ((char) c != ' ' || (char) c != '\n') {

                    s = s + (char) c;
                }
                c = fr.read();
            }

            fr.close();
        } catch (Exception e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }

        System.out.println("Read Numbers: " + s);
        char ch[] = s.toCharArray();
        // Sort the numbers in ascending order

        for (int i = 0; i < ch.length - 1; i++) {
            for (int j = 0; j < ch.length - i - 1; j++) {
                if (ch[j] > ch[j + 1]) {
                    char temp = ch[j];
                    ch[j] = ch[j + 1];
                    ch[j + 1] = temp;
                }
            }
        }
        String x = new String(ch).strip();
        System.out.println("Sorted Numbers: " + x);

        // Write the sorted numbers to another file
        PrintWriter pw2 = null;
        try {
            pw2 = new PrintWriter("file_num/sorted_numbers.txt");
            pw2.println(x);
            pw2.close();
        } catch (Exception e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Display the largest number on the console

        System.out.println("Largest Number: " + ch[ch.length - 1]);

    }
}