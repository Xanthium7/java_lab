package file;

import java.io.*;
import java.util.*;

class Student {
    int roll;
    String name;
    int marks;

    Student(int roll, String name, int marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }
}

class Main {
    public static void main(String[] args) {
        int n = 3;
        PrintWriter pw = null;
        BufferedReader br = null;

        Scanner sc = new Scanner(System.in);
        Student x[] = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Give roll" + (i + 1) + ": ");
            int roll = sc.nextInt();
            System.out.println("Give name" + (i + 1) + ": ");
            String name = sc.next();
            System.out.println("Give marks" + (i + 1) + ": ");
            int marks = sc.nextInt();
            x[i] = new Student(roll, name, marks);
        }

        try {
            pw = new PrintWriter("Student.txt");
            pw.println("Roll\tName\tMarks");
            br = new BufferedReader(new FileReader("Student.txt"));

            for (int i = 0; i < n; i++) {
                pw.println(x[i].roll + "\t" + x[i].name + "\t" + x[i].marks);
            }

            pw.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        Student y[] = new Student[n];
        try {
            String line = br.readLine();
            line = br.readLine();
            int j = 0;
            while (line != null) {
                StringTokenizer st = new StringTokenizer(line, "\t");
                y[j] = new Student(Integer.parseInt(st.nextToken()), st.nextToken(), Integer.parseInt(st.nextToken()));
                j++;

            }

            br.close();

        } catch (Exception e) {
            System.out.println(e);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Y DATA: \n");
            System.out.println(y[i].roll + "\t" + y[i].name + "\t" + y[i].marks);
        }

    }
}
