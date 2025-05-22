package Lab7.task2;

public class Book {
    private String title;
    private String author;
    private double price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    ///
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    ///

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
            System.out.println("Ціна успішно встановленна! ");
        }
        else
            System.out.println("Помилка! Ціна повинна бути більше нуля! ");
    }

    public void displayInfo() {
        System.out.println("Назва книги: " + title + ", автор: "+ author + ", ціна: " + price + " грн.");
    }
}
