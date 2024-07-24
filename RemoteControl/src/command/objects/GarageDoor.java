package command.objects;


// Receiver classes
public class GarageDoor {
    private final String location;

    public GarageDoor(String location) {
        this.location = location;
    }

    public void up() {
        System.out.println(location + " door is up");
    }

    public void down() {
        System.out.println(location +  " door is down");
    }

    public void stop() {
        System.out.println(location +  " door is stopped");
    }

    public void lightOn() {
        System.out.println(location + " light is on");
    }

    public void lightOff() {
        System.out.println(location +  " light is off");
    }
}
