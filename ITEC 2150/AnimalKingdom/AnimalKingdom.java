package AnimalKingdom;

public class AnimalKingdom {
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    public AnimalKingdom(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }
    public void eat() {
        System.out.println("AnimalKingdom.eat() called");//eat must be called by the object

    }

    public void move(int speed) {
        System.out.println("Animal.move() called.  Animal is moving at " +speed);

    }

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}

