package franchise.implementations;

import franchise.interfacs.PizzaIngredientsFactory;
import franchise.interfacs.PizzaStore;
import franchise.interfacs.Pizza;
import franchise.pizzas.CheesePizza;

public class ChicagoStylePizzaStore extends PizzaStore {
    public Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientsFactory ingredientsFactory =
                new ChicagoPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientsFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        }
        return pizza;
    }
}
