package Lab12.version3.models;

public class DVD extends LibraryItem {
    private int duration; // minutes

    public DVD(String title, int year, int duration) {
        super(title, year);
        this.duration = duration;
    }

    @Override
    public String getInfo() {
        return "DVD: " + title + " (" + year + ", " + duration + " min) [" + status + "]";
    }
}
