package Hamburger;

public class HealthyBurger extends Hamburger{

    private String healthyExtraName1;
    private double healthyExtraPrice1;

    private String healthyExtraName2;
    private double healthExtraPrice2;

    public HealthyBurger(String meat, double price){
        super("Impossible healthy burger", meat, price,"Sesame Bread Roll");
    }

    public void addHealthAddition1(String name, double price){
        this.healthyExtraName1 = name;
        this.healthyExtraPrice1 = price;
    }

    public void addHealthAddition2(String name, double price){
        this.healthyExtraName2 = name;
        this.healthExtraPrice2 = price;
    }


    @Override
    public double informationAboutAddition(){
       double hamburgerPrice =  super.informationAboutAddition();
       if(this.healthyExtraName1 != null){
          hamburgerPrice += this.healthyExtraPrice1;
           System.out.println("Added " + this.healthyExtraName1 + " for an extra " + this.healthyExtraPrice1);
       }
        if(this.healthyExtraName2 != null){
            hamburgerPrice += this.healthExtraPrice2;
            System.out.println("Added " + this.healthyExtraName2 + " for an extra " + this.healthExtraPrice2);
        }

            return hamburgerPrice;

    }

}

