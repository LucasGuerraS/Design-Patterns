package ducksui.application.factory.geese;

import ducksui.application.adapter.GooseAdapter;
import ducksui.application.implementations.Goose;
import ducksui.application.interfaces.Quackable;

public class GeeseFactory extends AbstractGeeseFactory {
    public Quackable createGeeseDuck() {
        return new GooseAdapter(new Goose());
    }
}
