package ducksui.application;

import ducksui.application.adapter.GooseAdapter;
import ducksui.application.composite.Flock;
import ducksui.application.decorator.QuackCounter;
import ducksui.application.factory.ducks.AbstractDuckFactory;
import ducksui.application.factory.ducks.CountingDuckFactory;
import ducksui.application.factory.geese.AbstractGeeseFactory;
import ducksui.application.factory.geese.GeeseFactory;
import ducksui.application.interfaces.Quackable;
import ducksui.application.observer.Quackologist;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        AbstractGeeseFactory geeseFactory = new GeeseFactory();
        simulator.simulate(duckFactory, geeseFactory);
    }

    public void simulate(AbstractDuckFactory duckFactory, AbstractGeeseFactory geeseFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redHeadDuck = duckFactory.createRedHeadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = geeseFactory.createGeeseDuck();

        System.out.println("\nDuck Simulator: With Composite - Flocks");

        Flock flockOfDucks = new Flock();

        flockOfDucks.add(redHeadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        Flock flockOfMallards = new Flock();

        Quackable mallardOne = duckFactory.createMallardDuck();
        Quackable mallardTwo = duckFactory.createMallardDuck();
        Quackable mallardThree = duckFactory.createMallardDuck();
        Quackable mallardFour = duckFactory.createMallardDuck();

        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);

        flockOfDucks.add(flockOfMallards);

        System.out.println("\nDuck Simulator: With Observer");

        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);

        simulate(flockOfDucks);

        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
    }

    public void simulate(Quackable duck) {
        duck.quack();
    }
}
