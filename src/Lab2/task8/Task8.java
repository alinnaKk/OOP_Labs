package Lab2.task8;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть свою електрону пошту: ");
        String userEmail = scanner.nextLine();

        if (!userEmail.contains("@")) {
            System.out.println("Ви ввели не електронну адресу. Спробуйте ще раз.");
        } else {
            String[] parts = userEmail.split("@", 2);
            String username = parts[0];
            String domain = parts[1];

            System.out.println("Інформація про користувача: username – " + username + ", поштовий сервіс - " + domain);
        }

        scanner.close();
    }
}

