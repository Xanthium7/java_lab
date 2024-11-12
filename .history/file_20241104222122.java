import java.io.*;
import java.util.Scanner;

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

        Scanner sc = new Scanner(System.in);
        Student x[] = new Student[5];

        for (int i = 0; i < n; i++) {
            System.out.println("Give roll, name, marks of Student  " + (i + 1));
            int roll = sc.nextInt();
            String name = sc.nextLine();
            int marks = sc.nextInt();
            x[i] = new Student(roll, name, marks);
        }

        try {
            pw = new PrintWriter("Student.txt");
            pw.println("Roll\tName\tMarks");

            for (int i = 0; i < n; i++) {
                pw.println(x[i].roll + "\t" + x[i].name + "\t" + x[i].marks);
            }

            pw.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
