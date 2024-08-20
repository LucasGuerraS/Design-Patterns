package ducksui.application.adapter;

import ducksui.application.implementations.Goose;
import ducksui.application.interfaces.Quackable;
import ducksui.application.observer.Observable;
import ducksui.application.observer.Observer;

public class GooseAdapter implements Quackable {
    Goose goose;
    Observable observable;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
        observable = new Observable(this);
    }

    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    public void notifyObservers() {
        observable.notifyObservers();
    }

    public void quack() {
        goose.honk();
    }
}
