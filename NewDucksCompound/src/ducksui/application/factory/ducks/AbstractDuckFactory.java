package ducksui.application.factory.ducks;

import ducksui.application.interfaces.Quackable;

public abstract class AbstractDuckFactory {
    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedHeadDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createRubberDuck();
}
