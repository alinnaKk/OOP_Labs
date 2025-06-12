package Lab12.version3.handlers;

import Lab12.version3.enums.ItemStatus;
import Lab12.version3.errors.ItemNotFoundException;
import Lab12.version3.errors.AlreadyBorrowedException;
import Lab12.version3.models.LibraryItem;
import Lab12.version3.models.User;
import Lab12.version3.servises.Library;

public class LibraryHandler {
    private final Library library;

    public LibraryHandler(Library library) {
        this.library = library;
    }

    public void borrowItem(String title, User user) throws Exception {
        LibraryItem item = library.findItemByTitle(title);
        if (item == null) throw new ItemNotFoundException("Item not found.");
        if (!item.isAvailable()) throw new AlreadyBorrowedException("Item already borrowed.");

        item.borrowItem();
        user.borrowItem(item);
    }

    public void returnItem(String title, User user) throws Exception {
        LibraryItem item = library.findItemByTitle(title);
        if (item == null) throw new ItemNotFoundException("Item not found.");

        item.returnItem();
        user.returnItem(item);
    }
}
