package pizzaType;

import ingredient.PizzaIngredientFactory;
import product.Pizza;

public class DoughPizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;
    public DoughPizza(PizzaIngredientFactory ingredientFactory) {
       this.ingredientFactory = ingredientFactory;
    }
    
    @Override
    public void prepare() {
       System.out.println("Preparing: " + getName());
       this.ingredientFactory.createDough();        
    }
}
