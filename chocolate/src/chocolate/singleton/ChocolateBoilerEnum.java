package chocolate.singleton;

// Enum implementation of Boiler class using singleton pattern
public enum ChocolateBoilerEnum {
    INSTANCE;
    private boolean empty;
    private boolean boiled;

    ChocolateBoilerEnum() {
        empty = true;
        boiled = false;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            System.out.println("Filling the boiler with a milk/chocolate mixture");
            // fill the boiler with a milk/chocolate mixture
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // drain the boiled milk and chocolate
            empty = true;
            System.out.println("Draining the boiled milk and chocolate");
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // bring the contents to a boil
            boiled = true;
            System.out.println("Bringing the contents to a boil");
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
