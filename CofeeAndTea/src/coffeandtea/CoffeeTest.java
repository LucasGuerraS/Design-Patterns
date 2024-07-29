package coffeandtea;
import coffeandtea.abstractions.CaffeineBeverage;
import coffeandtea.implementations.Coffee;
import coffeandtea.implementations.Tea;

public class CoffeeTest {
    public static void main(String[] args) {
        CaffeineBeverage coffee = new Coffee();
        CaffeineBeverage tea = new Tea();

        System.out.println("\nMaking coffee...");
        coffee.prepareRecipe();

        System.out.println("\nMaking tea...");
        tea.prepareRecipe();
    }
}
