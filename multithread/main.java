package multithread;

class Three extends Thread {
    public void run() {
        for (int i = 1; i < 30; i = i + 3) {
            try {
                System.out.println("THREE: " + i);
                Thread.sleep(500);

            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Five extends Thread {
    public void run() {
        for (int i = 1; i < 50; i = i + 5) {
            try {
                System.out.println("Five: " + i);
                Thread.sleep(500);

            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        Three t = new Three();
        Five f = new Five();

        t.start();
        f.start();
    }
}
