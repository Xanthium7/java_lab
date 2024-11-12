package multithread;

import java.util.*;

class Even extends Thread {
    int i;

    Even(int i) {
        this.i = i;
    }

    public void run() {
        System.out.println("Even: " + "(" + i + ")" + (i * i));
    }
}

class Odd extends Thread {
    int i;

    Odd(int i) {
        this.i = i;
    }

    public void run() {
        System.out.println("Odd: " + "(" + i + ")" + (i * i * i));
    }
}

class Two {
    public static void main(String[] args) {
        Random r = new Random();
        int x;

        for (int i = 0; i < 10; i++) {
            x = r.nextInt(10);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            if (x % 2 == 0) {
                Even e = new Even(x);
                e.start();
            } else {
                Odd o = new Odd(x);
                o.start();
            }
        }
    }
}
