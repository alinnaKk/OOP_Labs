package Lab5.task7;

import java.util.Random;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 100;

        System.out.println("Вітаю! Це гра Слот-машина!");
        System.out.println("Можливі символи: 🍒 (вишня), 🍋 (лимон), 🍊 (мандарин), 🏆 (кубок), ⚓ (якір)");
        System.out.println("Правила:");
        System.out.println(" - 3 однакових символи = ставка множиться: 🍒*5, 🍋*6, 🍊*7, 🏆*10, ⚓*12");
        System.out.println(" - 2 однакових символи = ставка множиться: 🍒*2, 🍋*2, 🍊*3, 🏆*4, ⚓*5");
        System.out.println("Початковий баланс: $100\n");

        while (balance > 0) {
            System.out.println("Ваш баланс: $" + balance);
            System.out.print("Введіть ставку: ");
            int bet = scanner.nextInt();

            if (bet > balance) {
                System.out.println("Недостатньо коштів для ставки!");
                continue;
            } else if (bet <= 0) {
                System.out.println("Ставка має бути більшою за 0!");
                continue;
            }

            balance -= bet;
            System.out.println("Обертаємо барабани...");

            String[] row = spinRow();
            printRow(row);

            int payout = getPayout(row, bet);
            if (payout > 0) {
                balance += payout;
                System.out.println("Ви виграли $" + payout + "!");
            } else {
                System.out.println("Ви програли цю ставку.");
            }

            if (balance <= 0) {
                System.out.println("Ваш баланс дорівнює нулю. Гра завершена.");
                break;
            }

            System.out.print("Бажаєте зіграти ще раз? (Y/N): ");
            String answer = scanner.next();
            if (!answer.equalsIgnoreCase("Y")) {
                System.out.println("Дякую за гру! Ваш фінальний баланс: $" + balance);
                break;
            }
        }

        scanner.close();
    }

    static String[] spinRow() {
        String[] symbols = {"🍒", "🍋", "🍊", "🏆", "⚓"};
        String[] result = new String[3];
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            result[i] = symbols[random.nextInt(symbols.length)];
        }
        return result;
    }

    static void printRow(String[] row) {
        System.out.println("***********************");
        System.out.println("| " + row[0] + " | " + row[1] + " | " + row[2] + " |");
        System.out.println("***********************");
    }

    static int getPayout(String[] row, int bet) {
        String a = row[0], b = row[1], c = row[2];

        int threeMatch = switch (a) {
            case "🍒" -> 5;
            case "🍋" -> 6;
            case "🍊" -> 7;
            case "🏆" -> 10;
            case "⚓" -> 12;
            default -> 0;
        };

        int twoMatch = switch (a) {
            case "🍒", "🍋" -> 2;
            case "🍊" -> 3;
            case "🏆" -> 4;
            case "⚓" -> 5;
            default -> 0;
        };

        if (a.equals(b) && a.equals(c)) {
            return bet * threeMatch;
        } else if (a.equals(b) || a.equals(c) || b.equals(c)) {
            String match = a.equals(b) || a.equals(c) ? a : b;
            int coeff = switch (match) {
                case "🍒", "🍋" -> 2;
                case "🍊" -> 3;
                case "🏆" -> 4;
                case "⚓" -> 5;
                default -> 0;
            };
            return bet * coeff;
        }

        return 0;
    }
}
