package Lab7.task2;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();

        book1.setTitle("Штиль");
        book1.setAuthor("Сергій Скришевський");
        book1.setPrice(422);
        book1.displayInfo();

        System.out.println();

        book2.setTitle("Тіло в бібліотеці");
        book2.setAuthor("Агата Крісті");
        book2.setPrice(-1000);
        book2.setPrice(250);
        book2.displayInfo();
    }
}
