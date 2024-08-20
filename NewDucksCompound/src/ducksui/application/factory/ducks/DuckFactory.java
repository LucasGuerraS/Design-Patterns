package ducksui.application.factory.ducks;

import ducksui.application.implementations.*;
import ducksui.application.interfaces.Quackable;

public class DuckFactory extends AbstractDuckFactory {
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    public Quackable createRedHeadDuck() {
        return new RedHeadDuck();
    }

    public Quackable createDuckCall() {
        return new DuckCall();
    }

    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
