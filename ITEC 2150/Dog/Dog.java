package Dog;

public class Dog {

    public String name;
    public String breed;
    public int age;

    public void writeOutput(){
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
        System.out.println("Age in calendar years: " + age);
        System.out.println("Age in human yeras: " + getAgeInHumanYears());

    }

    /**
     * if dog's age is less than equal to 2 years old, then you will compute the humanYears by using
     * age * 11
     *
     * otherwise, you will use following formula   22 + (age - 2) * 5
     *
     */
    public int getAgeInHumanYears() {
        if(age <= 2) 
            return age * 11;
        return 22 + (age - 2) * 5;
    }

}
