package chocolate.singleton;

public class ChocolateBoilerDoubleChecked {
    private boolean empty;
    private boolean boiled;
    private static volatile ChocolateBoilerDoubleChecked uniqueInstance;

    //Eagerly created instance
    //private static ChocolateBoilerDoubleChecked uniqueInstance = new ChocolateBoilerDoubleChecked();
    /* public static ChocolateBoilerDoubleChecked getInstance() {
        return uniqueInstance;
    }
    */

    private ChocolateBoilerDoubleChecked() {
        empty = true;
        boiled = false;
    }
    // This is the double-checked locking implementation
    public static ChocolateBoilerDoubleChecked getInstance() {
        if (uniqueInstance == null) {
            synchronized (ChocolateBoilerDoubleChecked.class) {
                if (uniqueInstance == null) {
                    System.out.println("Creating unique instance of Chocolate Boiler");
                    uniqueInstance = new ChocolateBoilerDoubleChecked();
                }
            }
        }
        System.out.println("Returning instance of Chocolate Boiler");
        return uniqueInstance;
    }

    //Synchronized method
    /* public static synchronized ChocolateBoilerDoubleChecked getInstance() {
        if (uniqueInstance == null) {
            System.out.println("Creating unique instance of Chocolate Boiler");
            uniqueInstance = new ChocolateBoilerDoubleChecked();
        }
        System.out.println("Returning instance of Chocolate Boiler");
        return uniqueInstance;
    }
    */

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // fill the boiler with a milk/chocolate mixture
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // drain the boiled milk and chocolate
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // bring the contents to a boil
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
