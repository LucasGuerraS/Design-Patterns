package franchise.implementations;

import franchise.interfacs.PizzaIngredientsFactory;
import franchise.interfacs.Dough;
import franchise.ingredients.ThinCrustDough;
import franchise.interfacs.Sauce;
import franchise.ingredients.MarinaraSauce;
import franchise.interfacs.Cheese;
import franchise.ingredients.ReggianoCheese;
import franchise.interfacs.Veggies;
import franchise.ingredients.Garlic;
import franchise.ingredients.Onion;
import franchise.ingredients.Mushroom;
import franchise.ingredients.RedPepper;
import franchise.interfacs.Pepperoni;
import franchise.ingredients.SlicedPepperoni;
import franchise.interfacs.Clams;
import franchise.ingredients.FreshClams;


public class NYPizzaIngredientFactory implements PizzaIngredientsFactory {
    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Veggies[] createVeggies() {
        return new Veggies[]{ new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FreshClams();
    }
}
