package starbuzz.condiments;

import starbuzz.abstractClasses.CondimentsDecorator;
import starbuzz.abstractClasses.Beverage;

public class Whip extends CondimentsDecorator {
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
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
