package Lab12.version3.models;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<LibraryItem> borrowedItems = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public void borrowItem(LibraryItem item) {
        borrowedItems.add(item);
    }

    public void returnItem(LibraryItem item) {
        borrowedItems.remove(item);
    }

    public List<LibraryItem> getBorrowedItems() {
        return borrowedItems;
    }

    public String getName() {
        return name;
    }
}
