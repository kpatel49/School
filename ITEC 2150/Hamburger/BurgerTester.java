package Hamburger;

public class BurgerTester {

    public static void main(String[] args) {


        Hamburger h1 = new Hamburger("Basis", "Sausage",2.00, "White");
        h1.addHamburgerAddition1("Siracha",0.5);
        h1.addHamburgerAddition2("Pickles",1);
        h1.addHamburgerAddition3("Bacon",2);
        System.out.println("Total burger price is " + h1.informationAboutAddition());


        HealthyBurger hb1 = new HealthyBurger("Turkey", 6);
        hb1.addHealthAddition1("Tomato",1);
        hb1.addHealthAddition2("Lettuce",1);

        System.out.println("Total healthy burger price is " +hb1.informationAboutAddition());

    }

}

