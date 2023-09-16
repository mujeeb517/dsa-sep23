public class Student {
    private String name;
    private int age;

    private double PI = 3.14;

    // getter, setter

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else throw new RuntimeException("invalid age");
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public double getPI() {
        return PI;
    }

    public void print() {
        System.out.println(this.name + " " + this.age);
    }
}
