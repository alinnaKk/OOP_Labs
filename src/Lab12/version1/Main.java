package Lab12.version1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> libraryBooks = new ArrayList<>(List.of(
                "Дім у волошковому морі - Т. Дж. Клюк ",
                "Кобзар - Т. Шевченко",
                "Стіни в моїй голові - В. Станчишин",
                "Гаррі Поттер і філософський камінь - Дж. Роулінг"
        ));

        List<String> borrowedBooks = new ArrayList<>();

        System.out.println("Вітаємо вас у бібліотеці!");

        while (true) {
            System.out.println("\nБібліотека");
            System.out.println("1. Переглянути список доступних книг");
            System.out.println("2. Позичити книгу");
            System.out.println("3. Повернути книгу");
            System.out.println("4. Переглянути список позичених книг");
            System.out.println("5. Вийти");

            System.out.print("Оберіть опцію: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    if (libraryBooks.isEmpty()) {
                        System.out.println("Наразі немає доступних книг.");
                    } else {
                        System.out.println("Доступні книги:");
                        for (int i = 0; i < libraryBooks.size(); i++) {
                            System.out.println((i + 1) + ". " + libraryBooks.get(i));
                        }
                    }
                    break;
                case "2":
                    if (libraryBooks.isEmpty()) {
                        System.out.println("Немає книг для позичення.");
                        break;
                    }
                    System.out.println("Введіть номер книги, яку хочете позичити:");
                    for (int i = 0; i < libraryBooks.size(); i++) {
                        System.out.println((i + 1) + ". " + libraryBooks.get(i));
                    }
                    try {
                        int bookIndex = Integer.parseInt(scanner.nextLine()) - 1;
                        if (bookIndex >= 0 && bookIndex < libraryBooks.size()) {
                            String book = libraryBooks.remove(bookIndex);
                            borrowedBooks.add(book);
                            System.out.println("Ви позичили: " + book);
                        } else {
                            System.out.println("Невірний номер книги.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Будь ласка, введіть число.");
                    }
                    break;
                case "3":
                    if (borrowedBooks.isEmpty()) {
                        System.out.println("У вас немає позичених книг.");
                        break;
                    }
                    System.out.println("Введіть номер книги, яку ви хочете повернути:");
                    for (int i = 0; i < borrowedBooks.size(); i++) {
                        System.out.println((i + 1) + ". " + borrowedBooks.get(i));
                    }
                    try {
                        int returnIndex = Integer.parseInt(scanner.nextLine()) - 1;
                        if (returnIndex >= 0 && returnIndex < borrowedBooks.size()) {
                            String returnedBook = borrowedBooks.remove(returnIndex);
                            libraryBooks.add(returnedBook);
                            System.out.println("Ви повернули: " + returnedBook);
                        } else {
                            System.out.println("Невірний номер книги.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Будь ласка, введіть число.");
                    }
                    break;
                case "4":
                    if (borrowedBooks.isEmpty()) {
                        System.out.println("У вас немає позичених книг.");
                    } else {
                        System.out.println("Ваші позичені книги:");
                        for (int i = 0; i < borrowedBooks.size(); i++) {
                            System.out.println((i + 1) + ". " + borrowedBooks.get(i));
                        }
                    }
                    break;
                case "5":
                    System.out.println("Дякуємо за користування бібліотекою!");
                    return;
                default:
                    System.out.println("Невірна опція. Спробуйте ще раз.");
            }
        }
    }
}
