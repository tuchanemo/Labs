package animals;

public class Cat extends Animal implements Pet {

    private String name;

    public Cat(String n) {
        super(4);
        this.name = n;
    }

    public Cat() {
        super(4);
        this.name = "Fluffy";
    }

    public String getName() {
        return name;
    }

    public void play() {
        System.out.println("Cat plays with mouse!");
    }

    public void eat() {
        System.out.println("Cat eats mouse!");
    }

    public void setName(String n) {
        this.name = n;
    }
}
