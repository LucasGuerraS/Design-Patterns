package ducksui.application.observer;

public interface QuackObserver {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
