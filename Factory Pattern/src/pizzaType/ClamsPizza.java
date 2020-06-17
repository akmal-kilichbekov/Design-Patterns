package pizzaType;

import ingredient.PizzaIngredientFactory;
import product.Pizza;

public class ClamsPizza extends Pizza{
    PizzaIngredientFactory ingredient;
    
    public ClamsPizza(PizzaIngredientFactory ingredientFactory) {
       this.ingredient = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing: " + getName());
        this.ingredient.createClam();        
    }   
    
}
