package Lab12.version2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<String> libraryBooks = new ArrayList<>(List.of(
            "Дім у волошковому морі - Т. Дж. Клюк ",
            "Кобзар - Т. Шевченко",
            "Стіни в моїй голові - В. Станчишин",
            "Гаррі Поттер і філософський камінь - Дж. Роулінг"
    ));

    static List<String> borrowedBooks = new ArrayList<>();

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            displayMenu();
            String choice = getUserInput("Оберіть опцію: ");

            switch (choice) {
                case "1":
                    viewAvailableBooks();
                    break;
                case "2":
                    borrowBook();
                    break;
                case "3":
                    returnBook();
                    break;
                case "4":
                    viewBorrowedBooks();
                    break;
                case "5":
                    System.out.println("Дякуємо за користування бібліотекою!");
                    return;
                default:
                    System.out.println("Невірна опція. Спробуйте ще раз.");
            }
        }
    }

    // Меню
    static void displayMenu() {
        System.out.println("\nБібліотека");
        System.out.println("1. Переглянути список доступних книг");
        System.out.println("2. Позичити книгу");
        System.out.println("3. Повернути книгу");
        System.out.println("4. Переглянути список позичених книг");
        System.out.println("5. Вийти");
    }

    // Введення користувача
    static String getUserInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    // Перегляд книг
    static void viewAvailableBooks() {
        if (libraryBooks.isEmpty()) {
            System.out.println("Наразі немає доступних книг.");
        } else {
            System.out.println("Доступні книги:");
            for (int i = 0; i < libraryBooks.size(); i++) {
                System.out.println((i + 1) + ". " + libraryBooks.get(i));
            }
        }
    }

    // Позичення книги
    static void borrowBook() {
        if (libraryBooks.isEmpty()) {
            System.out.println("Немає книг для позичення.");
            return;
        }

        viewAvailableBooks();
        String input = getUserInput("Введіть номер книги, яку хочете позичити: ");
        try {
            int index = Integer.parseInt(input) - 1;
            if (index >= 0 && index < libraryBooks.size()) {
                String book = libraryBooks.remove(index);
                borrowedBooks.add(book);
                System.out.println("Ви позичили: " + book);
            } else {
                System.out.println("Невірний номер книги.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Будь ласка, введіть число.");
        }
    }

    // Повернення книги
    static void returnBook() {
        if (borrowedBooks.isEmpty()) {
            System.out.println("У вас немає позичених книг.");
            return;
        }

        viewBorrowedBooks();
        String input = getUserInput("Введіть номер книги, яку хочете повернути: ");
        try {
            int index = Integer.parseInt(input) - 1;
            if (index >= 0 && index < borrowedBooks.size()) {
                String book = borrowedBooks.remove(index);
                libraryBooks.add(book);
                System.out.println("Ви повернули: " + book);
            } else {
                System.out.println("Невірний номер книги.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Будь ласка, введіть число.");
        }
    }

    // Перегляд позичених книг
    static void viewBorrowedBooks() {
        if (borrowedBooks.isEmpty()) {
            System.out.println("У вас немає позичених книг.");
        } else {
            System.out.println("Ваші позичені книги:");
            for (int i = 0; i < borrowedBooks.size(); i++) {
                System.out.println((i + 1) + ". " + borrowedBooks.get(i));
            }
        }
    }
}
