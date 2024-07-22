package ducks.others;

import ducks.behavior.quack.Quack;
import ducks.behavior.quack.QuackBehavior;

public class DuckCall {
    QuackBehavior quackBehavior;

    public DuckCall() {
        quackBehavior = new Quack();
    }

    public void makeSound() {
        quackBehavior.quack();
    }
}
