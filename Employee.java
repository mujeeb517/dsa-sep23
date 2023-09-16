// pascal casing
public class Employee {
    // 64bits
    // per class
    // per object
    // 10 objects -> 10 variables * 64 bits= > 640bits
    // 10 objects -> 1 variables * 64 = 64bits
    // private methods: within the class
    // public : anywhere
    // protected
    public static double PI = 3.14;
    // 64bits
    // instance variables
    // constructor
    // construct an object
    private String name;
    // 64bits
    private String dept = "IT";
    // 64bits
    private double salary = 200.5;
    // 8 bits
    private boolean active = true;

    public Employee(String name) {
        System.out.println("Constructor invoked");
        this.name = name;
    }

    public Employee(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }

    // camelcasing
    public void print() {
        System.out.println("Printing...");
        System.out.println(name);
        System.out.println(dept);
        System.out.println(salary);
        System.out.println(active);
        m1();
    }

    private void m1() {
        System.out.println("m1");
    }

    public static void m2() {
        System.out.println("m2");
    }
}