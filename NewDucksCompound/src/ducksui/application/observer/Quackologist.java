package ducksui.application.observer;

public class Quackologist implements Observer {

    public void update(QuackObserver duck) {
        System.out.println("Quackologist: " + duck + " just quacked.");
    }
}
