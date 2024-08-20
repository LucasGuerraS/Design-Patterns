package ducksui.application.interfaces;

import ducksui.application.observer.QuackObserver;

public interface Quackable extends QuackObserver {
    public void quack();
}
