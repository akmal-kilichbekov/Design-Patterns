
public class StarbuzzCoffee {

    public static void main(String[] args) {
       Beverage beverage = new Espresso();
       System.out.println(beverage.getDescription() + " cost: " + beverage.cost());
       
       beverage = new Mocha(beverage); // wrapping with Mocha
       beverage = new Soy(beverage); // wrapping with Soy;
       
       System.out.println(beverage.getDescription() + " cost: " + beverage.cost());

    }

}
