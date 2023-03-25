package AnimalKingdom;

public class SafariZoo {
    public static void main(String[] args) {
        AnimalKingdom animal = new AnimalKingdom("Animal",1,1,5,5);

        DogSpecies dog = new DogSpecies("Yorkie", 1, 1,
                2,4,2,4, 1,30,"Long and Silky");
        dog.eat();
        dog.walk();
        dog.run();
    }
}

