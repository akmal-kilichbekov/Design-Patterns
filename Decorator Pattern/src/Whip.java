public class Whip extends CondimentDecorator{
    Beverage beverage;
    
    public Whip(Beverage beverage) {
       this.beverage = beverage;
    }
    
    @Override
    public String getDescription() {
        return this.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
       return 4.4 + beverage.cost();
    }

}
