public class Cat extends Animal {

    public Cat() {
        System.out.println("Cat Constructor");
    }

    public void makeSound() {
        System.out.println("Meow");
    }

    // method overriding
    // method hiding
    public void print() {
        System.out.println("Child");
    }

}
