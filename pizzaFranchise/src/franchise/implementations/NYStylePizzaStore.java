package franchise.implementations;

import franchise.interfacs.PizzaIngredientsFactory;
import franchise.interfacs.PizzaStore;
import franchise.interfacs.Pizza;
import franchise.pizzas.CheesePizza;
import franchise.pizzas.VeggiePizza;
import franchise.pizzas.ClamPizza;
import franchise.pizzas.PepperoniPizza;

public class NYStylePizzaStore extends PizzaStore {

    public Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientsFactory ingredientsFactory =
                new NYPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientsFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientsFactory);
            pizza.setName("New York Style Veggie Pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientsFactory);
            pizza.setName("New York Style Clam Pizza");
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientsFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }
        return pizza;
    }
}
