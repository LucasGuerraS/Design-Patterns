package gumball.machine.interfaces;

public interface State {
    void insertQuarter();
    void ejectQuarter();
    boolean turnCrank();
    void dispense();
    void refill();
}
