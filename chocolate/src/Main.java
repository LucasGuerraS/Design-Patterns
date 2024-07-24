import chocolate.singleton.ChocolateBoiler;
import chocolate.singleton.ChocolateBoilerEnum;

public class Main {
    public static void main(String[] args) {
        // This is the first boiler
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        boiler.fill();
        boiler.boil();
        boiler.drain();
        // This is the second boiler
        ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
        boiler2.fill();
        boiler2.boil();
        boiler2.drain();
        // This is the third boiler it only drains, so it should not work
        ChocolateBoiler boiler3 = ChocolateBoiler.getInstance();
        boiler3.drain();

        // Using the enum version
        ChocolateBoilerEnum boiler4 = ChocolateBoilerEnum.INSTANCE;
        boiler4.fill();
        boiler4.boil();
        boiler4.drain();
        boiler4.drain();
    }
}