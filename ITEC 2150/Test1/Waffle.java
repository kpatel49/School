package Test1;

public class Waffle {



    private double flourCup;

    private double sugarCup;

    private double bakingSodateaSpoon;

    private double saltteaSpoon;



    public Waffle(){

        flourCup = 0;

        sugarCup = 0;

        bakingSodateaSpoon = 0;

        saltteaSpoon = 0;

    }



    public Waffle(double flourCup, double sugarCup, double bakingSodateaSpoon, double saltteaSpoon){

        super();

        this.flourCup = flourCup;

        this.sugarCup = sugarCup;

        this.bakingSodateaSpoon = bakingSodateaSpoon;

        this.saltteaSpoon = saltteaSpoon;

    }



    public double getFlourCup() {

        return flourCup;

    }



    public void setFlourCup(double flourCup) {

        this.flourCup = flourCup;

    }



    public double getSugarCup() {

        return sugarCup;

    }



    public void setSugarCup(double sugarCup) {

        this.sugarCup = sugarCup;

    }



    public double getBakingSodateaSpoon() {

        return bakingSodateaSpoon;

    }



    public void setBakingSodateaSpoon(double bakingSodateaSpoon) {

        this.bakingSodateaSpoon = bakingSodateaSpoon;

    }



    public double getSaltteaSpoon() {

        return saltteaSpoon;

    }



    public void setSaltteaSpoon(double saltteaSpoon) {

        this.saltteaSpoon = saltteaSpoon;

    }





    //public Waffle(double flourCup, double sugarCup, double bakingSodateaSpoon, double saltteaSpoon)

    public String toString(){

        return "Waffle Ingredients:\nFlour(Cup): " + flourCup + "\nSugar(Cup): " + sugarCup

                + "\nBaking Soda(teaspoon): " + bakingSodateaSpoon + "\nSalt(teaspoon): " + saltteaSpoon;

    }

}