import gumball.machine.server.GumballMachine;

import java.rmi.Naming;
// Server code
public class GumballMachineTest {
    public static void main(String[] args) {
        try {
            GumballMachine gumballMachine = new GumballMachine(100, "santos");
            Naming.rebind("santos", gumballMachine);
            GumballMachine gumballMachine2 = new GumballMachine(150, "criciuma");
            Naming.rebind("criciuma", gumballMachine);
            GumballMachine gumballMachine3 = new GumballMachine(200, "bahia");
            Naming.rebind("bahia", gumballMachine);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
