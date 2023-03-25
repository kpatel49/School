package Hamburger;

public class DeluxBurger extends Hamburger {

    public DeluxBurger(){
        super("Delux", "Ribeye", 15.00,"Sourdough");
        super.addHamburgerAddition1("Chees",0.5);
        super.addHamburgerAddition2("Drink",2.50);


    }

}
