package coroutines;

public class Dog {
    private final String name;
    private final int weight;
    private final String breed;
    public Dog(String name, int weight, String breed) {
        this.name = name;
        this.weight = weight;
        this.breed = breed;
    }
    public void walk() {
        System.out.println(this.name + " is walking....");
    }
    public void bark() {
        if (this.weight < 20) {
            System.out.println("yipp..");
        } else {
            System.out.println("Wooof...");
        }
    }
}
