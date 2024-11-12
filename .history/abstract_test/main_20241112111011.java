package abstract_test;

interface Shaping {
    int a = 10;

    void area();

}

abstract class Shape {
    int a, b;

    abstract void area();

    void display() {
        System.out.println("Hello World!");
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
