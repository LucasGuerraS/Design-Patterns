package starbuzz.condiments;

import starbuzz.abstractClasses.CondimentsDecorator;
import starbuzz.abstractClasses.Beverage;

public class SteamedMilk extends CondimentsDecorator {
    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Steamed Milk";
    }

    public double cost() {
        double cost = beverage.cost();
        if (getSize() == Size.TALL) {
            cost += .05;
        } else if (getSize() == Size.GRANDE) {
            cost += .10;
        } else if (getSize() == Size.VENTI) {
            cost += .15;
        }
        return cost;
    }
}
