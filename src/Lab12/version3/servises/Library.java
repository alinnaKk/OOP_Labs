package Lab12.version3.servises;

import Lab12.version3.models.LibraryItem;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<LibraryItem> items = new ArrayList<>();

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public List<LibraryItem> getItems() {
        return items;
    }

    public LibraryItem findItemByTitle(String title) {
        return items.stream().filter(i -> i.getTitle().equalsIgnoreCase(title)).findFirst().orElse(null);
    }
}
