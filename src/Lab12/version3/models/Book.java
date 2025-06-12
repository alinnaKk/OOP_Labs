package Lab12.version3.models;

import Lab12.version3.interfaces.Reservable;
import Lab12.version3.enums.ItemStatus;

public class Book extends LibraryItem implements Reservable {
    private String author;
    private boolean reserved = false;

    public Book(String title, String author, int year) {
        super(title, year);
        this.author = author;
    }

    @Override
    public String getInfo() {
        return "Book: " + title + " by " + author + " (" + year + ") [" + status + "]";
    }

    @Override
    public void reserve() {
        reserved = true;
        status = ItemStatus.RESERVED;
    }

    @Override
    public boolean isReserved() {
        return reserved;
    }
}
