
public class Mocha extends CondimentDecorator{
    Beverage beverage;
    
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
       return this.beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.50 + beverage.cost();
    }

}
