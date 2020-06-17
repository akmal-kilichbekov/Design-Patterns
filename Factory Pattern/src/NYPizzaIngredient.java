
public class NYPizzaIngredient implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new Dough();
    }

    @Override
    public Sauce createSauce() {
        return new Sauce();
    }

    @Override
    public Clams createClam() {
        return new Clams();
    }
}
