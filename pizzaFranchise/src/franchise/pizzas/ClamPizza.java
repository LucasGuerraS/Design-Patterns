package franchise.pizzas;

import franchise.interfacs.Pizza;
import franchise.interfacs.PizzaIngredientsFactory;

public class ClamPizza extends Pizza {
    public PizzaIngredientsFactory ingredientsFactory;

    public ClamPizza(PizzaIngredientsFactory ingredientsFactory) {
        this.ingredientsFactory = ingredientsFactory;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientsFactory.createDough();
        sauce = ingredientsFactory.createSauce();
        cheese = ingredientsFactory.createCheese();
        clam = ingredientsFactory.createClam();
    }
}
