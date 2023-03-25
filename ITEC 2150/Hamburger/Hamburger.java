package Hamburger;

/**
 * Inheritance challenge – Hamburger place (Main, Hamburger, two other Burger type class)
 * Hamburger class should have bread roll type, meat, and up to 4 additional additions
 * (e.g. lettuce, tomato, carrot, etc) to select to be added to the burger.
 * Each item will be charged an additional price your program must track
 * HealthyBurger and DeluxBurger
 */
public class Hamburger {

    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String additionName1;
    private double additionPrice1;

    private String additionName2;
    private double additionPrice2;

    private String additionName3;
    private double additionPrice3;

    private String additionName4;
    private double additionPrice4;


    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }


    public void addHamburgerAddition1(String name, double price){
        this.additionName1 = name;
        this.additionPrice1 = price;
    }

    public void addHamburgerAddition2(String name, double price){
        this.additionName2 = name;
        this.additionPrice2 = price;
    }

    public void addHamburgerAddition3(String name, double price){
        this.additionName3 = name;
        this.additionPrice3 = price;
    }

    public void addHamburgerAddition4(String name, double price){
        this.additionName4 = name;
        this.additionPrice4 = price;
    }

    public double informationAboutAddition(){
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger " + " on a " + this.breadRollType + " roll with " +  this.meat
        + ", price is " + this.price);

        if(this.additionName1 != null){
            hamburgerPrice += this.additionPrice1;
            System.out.println("Added " + this.additionName1 + " for an extra " + this.additionPrice1);
        }

        if(this.additionName2 != null){
            hamburgerPrice += this.additionPrice2;
            System.out.println("Added " + this.additionName2 + " for an extra " + this.additionPrice2);
        }
        if(this.additionName3 != null){
            hamburgerPrice += this.additionPrice3;
            System.out.println("Added " + this.additionName3 + " for an extra " + this.additionPrice3);
        }
        if(this.additionName4 != null){
            hamburgerPrice += this.additionPrice4;
            System.out.println("Added " + this.additionName4 + " for an extra " + this.additionPrice4);
        }

        return hamburgerPrice;

    }
}