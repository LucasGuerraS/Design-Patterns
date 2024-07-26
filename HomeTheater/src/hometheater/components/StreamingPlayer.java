package hometheater.components;

public class StreamingPlayer {
    public void on() {
        System.out.println("StreamingPlayer on");
    }

    public void off() {
        System.out.println("StreamingPlayer off");
    }

    public void play(String movie) {
        System.out.println("StreamingPlayer playing " + movie);
    }

    public void stop() {
        System.out.println("StreamingPlayer stopped");
    }

    public void pause() {
        System.out.println("StreamingPlayer paused");
    }

    public void setSurroundAudio() {
        System.out.println("StreamingPlayer setSurroundAudio");
    }

    public void setTwoChannelAudio() {
        System.out.println("StreamingPlayer setTwoChannelAudio");
    }

    public void setVolume(int volume) {
        System.out.println("StreamingPlayer volume set to " + volume);
    }
}
