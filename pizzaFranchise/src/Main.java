import franchise.implementations.NYStylePizzaStore;
import franchise.interfacs.Pizza;
import franchise.interfacs.PizzaStore;
import franchise.implementations.ChicagoStylePizzaStore;

public class Main {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("clam");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        Pizza pizza2 = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza2.getName() + "\n");
    }
}