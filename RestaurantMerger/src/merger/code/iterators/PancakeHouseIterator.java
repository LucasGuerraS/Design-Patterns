package merger.code.iterators;

import merger.code.implementations.MenuItem;
import merger.code.interfaces.Iterator;
import java.util.ArrayList;

public class PancakeHouseIterator implements Iterator {
    ArrayList<MenuItem> items;
    int position = 0;

    public PancakeHouseIterator(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public MenuItem next() {
        MenuItem menuItem = items.get(position);
        position = position + 1;
        return menuItem;
    }

    public boolean hasNext() {
        if (position >= items.size() || items.get(position) == null) {
            return false;
        } else {
            return true;
        }
    }
}
