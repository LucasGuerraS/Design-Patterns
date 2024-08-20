package ducksui.application.implementations;

import ducksui.application.interfaces.Quackable;
import ducksui.application.observer.Observable;
import ducksui.application.observer.Observer;

public class RubberDuck implements Quackable {
    Observable observable;

    public RubberDuck() {
        observable = new Observable(this);
    }

    public void quack() {
        System.out.println("Squeak");
        notifyObservers();
    }

    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    public void notifyObservers() {
        observable.notifyObservers();
    }
}