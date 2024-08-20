package djmvc.application.test;

import djmvc.application.controller.implementation.BeatController;
import djmvc.application.controller.interfaces.ControllerInterface;
import djmvc.application.model.implementation.BeatModel;
import djmvc.application.model.interfaces.BeatModelInterface;

public class DJTest {
    public static void main (String[] args) {
        BeatModelInterface model = new BeatModel();
        ControllerInterface controller = new BeatController(model);
    }
}
