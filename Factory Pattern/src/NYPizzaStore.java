
public class NYPizzaStore extends PizzaStore{

    @Override
    Pizza createPizza(String type) {
        if (type.contains("cheese")) {
            return new NYStyleCheesePizza();
        }
        return null;
    }

}
