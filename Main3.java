public class Main3 {

    static void method1() {
        System.out.println("m1");
    }

    public static void main(String[] args) {
        // caller
        int x = add(10, 20, 40);
        double y = add(20.20, 430.2);
        System.out.println(x);
    }

    // methods
    // callee

    // parameters
    // arguments
    // input
    // output
    // void
    // return type
    // method overloading
    // signature
    // classes, objects, method overriding, inheritance, interfaces
    static int add(int a, int b) {
        int c = a + b;
        return c;
    }

    static int add(int a, int b, int c) {
        int d = a + b + c;
        return d;
    }

    static double add(double a, double b) {
        double c = a + b;
        return c;
    }
}
