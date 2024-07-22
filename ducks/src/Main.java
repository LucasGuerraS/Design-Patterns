import ducks.duck.Duck;
import ducks.duck.MallardDuck;
import ducks.duck.ModelDuck;
import ducks.behavior.fly.FlyRocketPowered;
import ducks.others.DuckCall;

public class Main {
    public static void main(String[] args) {

        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

        DuckCall call = new DuckCall();
        call.makeSound();
    }
}