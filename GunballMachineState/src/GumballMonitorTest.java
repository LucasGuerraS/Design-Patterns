import gumball.machine.client.GumballMonitor;
import gumball.machine.interfaces.GumballMachineRemote;

import java.rmi.*;
// Client code
public class GumballMonitorTest {
    public static void main(String[] args) {
        String[] location = {
            "rmi://127.0.0.1/santos",
            "rmi://127.0.0.1/bahia",
            "rmi://127.0.0.1/criciuma"
        };

        GumballMonitor[] monitor = new GumballMonitor[location.length];

        for (int i = 0; i < location.length; i++) {
            try {
                GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(location[i]);
                monitor[i] = new GumballMonitor(machine);
                System.out.println(monitor[i]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < monitor.length; i++) {
            monitor[i].report();
        }
    }
}

