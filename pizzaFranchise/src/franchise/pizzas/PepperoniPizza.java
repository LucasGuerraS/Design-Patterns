package franchise.pizzas;

import franchise.interfacs.Pizza;
import franchise.interfacs.PizzaIngredientsFactory;

public class PepperoniPizza extends Pizza {
    public PizzaIngredientsFactory ingredientsFactory;

    public PepperoniPizza(PizzaIngredientsFactory ingredientsFactory) {
        this.ingredientsFactory = ingredientsFactory;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientsFactory.createDough();
        sauce = ingredientsFactory.createSauce();
        cheese = ingredientsFactory.createCheese();
        pepperoni = ingredientsFactory.createPepperoni();
    }
}
