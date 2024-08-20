package djmvc.application.model.interfaces;

import djmvc.application.view.interfaces.BPMObserver;
import djmvc.application.view.interfaces.BeatObserver;

public interface BeatModelInterface {
    void initialize();
    void on();
    void off();
    void setBPM(int bpm);
    int getBPM();
    void registerObserver(BeatObserver o);
    void removeObserver(BeatObserver o);
    void registerObserver(BPMObserver o);
    void removeObserver(BPMObserver o);
}
