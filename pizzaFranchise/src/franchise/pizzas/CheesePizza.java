package franchise.pizzas;

import franchise.interfacs.Pizza;
import franchise.interfacs.PizzaIngredientsFactory;

public class CheesePizza extends Pizza {
    PizzaIngredientsFactory ingredientsFactory;

    public CheesePizza(PizzaIngredientsFactory ingredientsFactory) {
        this.ingredientsFactory = ingredientsFactory;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientsFactory.createDough();
        sauce = ingredientsFactory.createSauce();
        cheese = ingredientsFactory.createCheese();
    }
}
