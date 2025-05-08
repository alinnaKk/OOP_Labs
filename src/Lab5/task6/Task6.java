package Lab5.task6;

import java.util.Scanner;
import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] options = {"rock", "paper", "scissors"};
        String userChoice;
        String computerChoice;
        boolean playAgain;

        do {
            // Отримання вибору користувача
            while (true) {
                System.out.print("Введіть свій вибір (rock, paper, scissors): ");
                userChoice = scanner.nextLine().toLowerCase();

                if (userChoice.equals("rock") || userChoice.equals("paper") || userChoice.equals("scissors")) {
                    break;
                } else {
                    System.out.println("Некоректне значення. Спробуйте ще раз.");
                }
            }

            // Випадковий вибір комп’ютера
            int randomIndex = random.nextInt(3);
            computerChoice = options[randomIndex];
            System.out.println("Комп’ютер обрав: " + computerChoice);

            // Визначення переможця
            if (userChoice.equals(computerChoice)) {
                System.out.println("Нічия!");
            } else if (
                    (userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                            (userChoice.equals("scissors") && computerChoice.equals("paper")) ||
                            (userChoice.equals("paper") && computerChoice.equals("rock"))
            ) {
                System.out.println("Ви виграли!");
            } else {
                System.out.println("Ви програли.");
            }

            // Запит, чи гравець хоче зіграти ще раз
            System.out.print("Бажаєте зіграти ще раз? (yes/no): ");
            String response = scanner.nextLine().toLowerCase();
            playAgain = response.equals("yes");

        } while (playAgain);

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
