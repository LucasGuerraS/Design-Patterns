package starbuzz.condiments;

import starbuzz.abstractClasses.CondimentsDecorator;
import starbuzz.abstractClasses.Beverage;

public class Soy extends CondimentsDecorator {
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {
        double cost = beverage.cost();
        if (getSize() == Size.TALL) {
            cost += .10;
        } else if (getSize() == Size.GRANDE) {
            cost += .15;
        } else if (getSize() == Size.VENTI) {
            cost += .20;
        }
        return cost;
    }
}
