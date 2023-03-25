package Final;

public class Starbucks {

    public static void main(String[] args) {
        Customer michelle = new Customer("Michelle", "Vanilla Latte");
        Customer carina = new Customer("Carina", "Strawberry Frappuccino");

       Partner partner = new Partner();
        partner.takeOrder(michelle);
        partner.takeOrder(carina);

        //prepare drink
        partner.prepareDrink("Vanilla Latte");
        partner.prepareDrink("Strawberry Frappuccino");

        //order up ...
        partner.callOutCompletedOrder();
    }
}