package Lab12.version3.models;

import Lab12.version3.enums.ItemStatus;

public abstract class LibraryItem {
    protected String title;
    protected int year;
    protected ItemStatus status = ItemStatus.AVAILABLE;

    public LibraryItem(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public boolean isAvailable() {
        return status == ItemStatus.AVAILABLE;
    }

    public void borrowItem() {
        status = ItemStatus.BORROWED;
    }

    public void returnItem() {
        status = ItemStatus.AVAILABLE;
    }

    public ItemStatus getStatus() {
        return status;
    }

    public abstract String getInfo();
    public String getTitle() {
        return title;
    }
}
