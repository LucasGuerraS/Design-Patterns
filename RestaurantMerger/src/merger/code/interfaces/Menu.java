package merger.code.interfaces;

import merger.code.implementations.MenuItem;
import java.util.Iterator;

public interface Menu {
    public Iterator<MenuItem> createIterator();
}
