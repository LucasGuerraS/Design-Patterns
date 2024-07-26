package hometheater.components;

public class Projector {
    public void on() {
        System.out.println("Projector on");
    }

    public void off() {
        System.out.println("Projector off");
    }

    public void wideScreenMode() {
        System.out.println("Projector in wide screen mode (16x9 aspect ratio)");
    }

    public void tvMode() {
        System.out.println("Projector in tv mode (4x3 aspect ratio)");
    }
}
