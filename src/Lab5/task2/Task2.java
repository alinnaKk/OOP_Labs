package Lab5.task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = 0.0;
        int choice;

        do {
            // Меню користувача
            System.out.println("\nБанківська програма");
            System.out.println("1. Показати поточний баланс");
            System.out.println("2. Внести кошти на рахунок");
            System.out.println("3. Зняти кошти з рахунку");
            System.out.println("4. Завершити роботу");
            System.out.print("Виберіть дію: ");

            choice = scanner.nextInt();

            // Вибір користувача
            switch (choice) {
                case 1:
                    showBalance(balance);
                    break;
                case 2:
                    balance = deposit(scanner, balance);
                    break;
                case 3:
                    balance = withdraw(scanner, balance);
                    break;
                case 4:
                    System.out.println("Програма завершена.");
                    break;
                default:
                    System.out.println("Невірний вибір, спробуйте ще раз.");
            }
        } while (choice != 4);

        scanner.close();
    }

    // Метод для відображення балансу
    static void showBalance(double balance) {
        System.out.printf("Ваш поточний баланс: %.2f грн\n", balance);
    }

    // Метод для внесення коштів
    static double deposit(Scanner scanner, double balance) {
        System.out.print("Введіть суму для внесення: ");
        double depositAmount = scanner.nextDouble();

        if (depositAmount > 0) {
            balance += depositAmount;
            System.out.printf("Внесено %.2f грн. Ваш новий баланс: %.2f грн.\n", depositAmount, balance);
        } else {
            System.out.println("Сума повинна бути більшою за 0.");
        }

        return balance;
    }

    // Метод для зняття коштів
    static double withdraw(Scanner scanner, double balance) {
        System.out.print("Введіть суму для зняття: ");
        double withdrawAmount = scanner.nextDouble();

        if (withdrawAmount > 0 && withdrawAmount <= balance) {
            balance -= withdrawAmount;
            System.out.printf("Знято %.2f грн. Ваш новий баланс: %.2f грн.\n", withdrawAmount, balance);
        } else if (withdrawAmount > balance) {
            System.out.println("Недостатньо коштів на рахунку.");
        } else {
            System.out.println("Сума повинна бути більшою за 0.");
        }

        return balance;
    }
}
