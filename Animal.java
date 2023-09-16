public abstract class Animal {
    String name;
    String breed;
    double weight;

    public Animal() {
        System.out.println("Animal Constructor");
    }

    public void print() {
        System.out.println("printing parent");
    }
}
