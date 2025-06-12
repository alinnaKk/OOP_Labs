package Lab12.version3;

import Lab12.version3.handlers.LibraryHandler;
import Lab12.version3.handlers.UserInputHandler;
import Lab12.version3.models.*;
import Lab12.version3.servises.Library;

public class Main {
    public static void main(String[] args) throws Exception {
        Library library = new Library();
        LibraryHandler handler = new LibraryHandler(library);
        User user = new User("Alina");

        library.addItem(new Book("1984", "George Orwell", 1949));
        library.addItem(new Magazine("Science Today", 12, 2023));
        library.addItem(new DVD("Inception", 2010, 148));

        boolean running = true;
        while (running) {
            System.out.println("\n=== Library Menu ===");
            System.out.println("1. View items");
            System.out.println("2. Borrow item");
            System.out.println("3. Return item");
            System.out.println("4. View borrowed items");
            System.out.println("0. Exit");

            String choice = UserInputHandler.getInput("Choose: ");
            switch (choice) {
                case "1" -> library.getItems().forEach(i -> System.out.println(i.getInfo()));
                case "2" -> {
                    String title = UserInputHandler.getInput("Enter item title to borrow: ");
                    try {
                        handler.borrowItem(title, user);
                        System.out.println("Item borrowed.");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                case "3" -> {
                    String title = UserInputHandler.getInput("Enter item title to return: ");
                    try {
                        handler.returnItem(title, user);
                        System.out.println("Item returned.");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                case "4" -> user.getBorrowedItems().forEach(i -> System.out.println(i.getInfo()));
                case "0" -> running = false;
                default -> System.out.println("Invalid option.");
            }
        }
    }
}
