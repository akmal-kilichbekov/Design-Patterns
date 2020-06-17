package NYPizza;

import creator.PizzaStore;
import ingredient.PizzaIngredientFactory;
import pizzaType.ClamsPizza;
import pizzaType.DoughPizza;
import pizzaType.SaucePizza;
import product.Pizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredient();

        if (type.contains("dough")) {
            pizza = new DoughPizza(ingredientFactory);
            pizza.setName("New York dough pizza");
        } else if (type.contains("clams")) {
            pizza = new ClamsPizza(ingredientFactory);
            pizza.setName("New York clams pizza");
        } else if (type.contains("sauce")) {
            pizza = new SaucePizza(ingredientFactory);
            pizza.setName("New York sauce pizza");
        }

        return pizza;
    }

}
