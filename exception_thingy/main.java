package exception_thingy;

class CoolException extends Exception {
    CoolException(String s) {
        super(s);
    }
}

class Main {

    static void check(int n) throws CoolException {
        if (n > 0) {
            throw new CoolException("Number is positive");
        }
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = 0;
        try {
            check(a);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Result: " + c);
    }

}
