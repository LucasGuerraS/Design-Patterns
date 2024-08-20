package ducksui.application.factory.ducks;

import ducksui.application.decorator.QuackCounter;
import ducksui.application.implementations.*;
import ducksui.application.interfaces.Quackable;

public class CountingDuckFactory extends AbstractDuckFactory {
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    public Quackable createRedHeadDuck() {
        return new QuackCounter(new RedHeadDuck());
    }

    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
