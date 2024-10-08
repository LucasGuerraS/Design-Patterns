package merger.code;

import merger.code.abstractions.MenuComponent;
import merger.code.composite.implementations.Menu;
import merger.code.composite.implementations.MenuItem;
import merger.code.implementations.CafeMenu;
import merger.code.implementations.DinerMenu;
import merger.code.implementations.PancakeHouseMenu;
import merger.code.implementations.Waitress;

public class Test {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        pancakeHouseMenu.add(new MenuItem(
                "K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast",
                true,
                2.99)
        );

        pancakeHouseMenu.add(new MenuItem(
                "Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99)
        );

        pancakeHouseMenu.add(new MenuItem(
                "Blueberry Pancakes",
                "Pancakes made with fresh blueberries",
                true,
                3.49)
        );

        pancakeHouseMenu.add(new MenuItem(
                "Waffles",
                "Waffles, with your choice of blueberries or strawberries",
                true,
                3.59)
        );

        dinerMenu.add(new MenuItem(
                "Pasta",
                "Spaghetti with Marinara Sauce, and a slice of sourdough bread",
                true,
                3.89)
        );

        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem(
                "Apple Pie",
                "Apple pie with a flakey crust, topped with vanilla ice cream",
                true,
                1.59)
        );

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
