package coffeandtea.implementations;

import coffeandtea.abstractions.CaffeineBeverage;

public class Coffee extends CaffeineBeverage {
    public void brew() {
        System.out.println("Dripping coffee through filter");
    }

    public void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}
