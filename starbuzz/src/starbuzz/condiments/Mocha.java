package starbuzz.condiments;

import starbuzz.abstractClasses.CondimentsDecorator;
import starbuzz.abstractClasses.Beverage;

public class Mocha extends CondimentsDecorator {
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        double cost = beverage.cost();
        if (getSize() == Size.TALL) {
            cost += .15;
        } else if (getSize() == Size.GRANDE) {
            cost += .20;
        } else if (getSize() == Size.VENTI) {
            cost += .25;
        }
        return cost;
    }
}
