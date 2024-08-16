package gumball.machine.interfaces;

import java.io.Serializable;

public interface State extends Serializable {
    void insertQuarter();
    void ejectQuarter();
    boolean turnCrank();
    void dispense();
    void refill();
}
