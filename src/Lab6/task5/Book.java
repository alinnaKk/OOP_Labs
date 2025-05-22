package Lab6.task5;

public class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title) {
        this.title = title;
        this.author = "Невідомий";
    }

    public void printInfo() {
        System.out.println("Назва: " + title + ", Автор: " + author);
    }
}
