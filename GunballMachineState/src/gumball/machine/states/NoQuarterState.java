package gumball.machine.states;

import gumball.machine.server.GumballMachine;
import gumball.machine.interfaces.State;

public class NoQuarterState implements State {
    private static final long serialVersionUID = 2L;

    transient GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    public boolean turnCrank() {
        System.out.println("You turned, but there's no quarter");
        return false;
    }

    public void dispense() {
        System.out.println("You need to pay first");
    }

    public void refill() {
        System.out.println("Machine is full");
    }
}
