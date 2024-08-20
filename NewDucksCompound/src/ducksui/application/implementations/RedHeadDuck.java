package ducksui.application.implementations;

import ducksui.application.interfaces.Quackable;
import ducksui.application.observer.Observable;
import ducksui.application.observer.Observer;

public class RedHeadDuck implements Quackable {
    Observable observable;

    public RedHeadDuck() {
        observable = new Observable(this);
    }

    public void quack() {
        System.out.println("Quack");
        notifyObservers();
    }

    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    public void notifyObservers() {
        observable.notifyObservers();
    }
}