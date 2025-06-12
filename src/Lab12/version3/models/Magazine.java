package Lab12.version3.models;

public class Magazine extends LibraryItem {
    private int issueNumber;

    public Magazine(String title, int issueNumber, int year) {
        super(title, year);
        this.issueNumber = issueNumber;
    }

    @Override
    public String getInfo() {
        return "Magazine: " + title + " (Issue " + issueNumber + ", " + year + ") [" + status + "]";
    }
}
