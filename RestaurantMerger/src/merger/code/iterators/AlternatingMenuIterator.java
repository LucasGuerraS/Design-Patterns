package merger.code.iterators;

import merger.code.implementations.MenuItem;

import java.util.Calendar;
import java.util.Iterator;

public class AlternatingMenuIterator implements Iterator<MenuItem> {
    MenuItem[] items;
    int position;

    public AlternatingMenuIterator(MenuItem[] items) {
        this.items = items;
        position = Calendar.DAY_OF_WEEK % 2;
    }

    public MenuItem next() {
        MenuItem menuItem = items[position];
        position = position + 2;
        return menuItem;
    }

    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("You shouldn't be trying to remove menu items");
    }
}
