package pizzaType;

import ingredient.PizzaIngredientFactory;
import product.Pizza;

public class SaucePizza extends Pizza{
    PizzaIngredientFactory ingredient;
    
    public SaucePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredient = ingredientFactory;
    }

    @Override
    public void prepare() {
       System.out.println("Preparing: " + getName());   
       ingredient.createSauce();
    }

}
