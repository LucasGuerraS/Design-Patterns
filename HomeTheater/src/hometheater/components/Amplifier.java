package hometheater.components;

public class Amplifier {
    public void on() {
        System.out.println("Top-O-Line Amplifier on");
    }

    public void off() {
        System.out.println("Top-O-Line Amplifier off");
    }

    public void setStreamingPlayer(StreamingPlayer dvd) {
        System.out.println("Top-O-Line Amplifier setting DVD player to " + dvd);
    }

    public void setSurroundSound() {
        System.out.println("Top-O-Line Amplifier surround sound on (5 speakers, 1 subwoofer)");
    }

    public void setVolume(int level) {
        System.out.println("Top-O-Line Amplifier setting volume to " + level);
    }
}
