package Lab5.task5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        String[] questions = {
                "1. Яка столиця Франції?",
                "2. Скільки планет у Сонячній системі?",
                "3. Хто автор 'Кобзаря'?",
                "4. Яка тварина є найбільшою у світі?",
                "5. Скільки континентів на Землі?"
        };

        String[][] options = {
                {"A. Лондон", "B. Берлін", "C. Париж", "D. Мадрид"},
                {"A. 8", "B. 9", "C. 7", "D. 6"},
                {"A. Франко", "B. Шевченко", "C. Лесі Українка", "D. Коцюбинський"},
                {"A. Слон", "B. Кашалот", "C. Акула", "D. Синій кит"},
                {"A. 5", "B. 6", "C. 7", "D. 8"}
        };

        char[] correctAnswers = {'C', 'A', 'B', 'D', 'C'};

        Scanner scanner = new Scanner(System.in);

        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }

            char answer;
            while (true) {
                System.out.print("Ваша відповідь (A/B/C/D): ");
                String input = scanner.nextLine().toUpperCase();

                if (input.length() == 1 && "ABCD".contains(input)) {
                    answer = input.charAt(0);
                    break;
                } else {
                    System.out.println("Невірне введення. Введіть A, B, C або D.");
                }
            }

            if (answer == correctAnswers[i]) {
                System.out.println("✅ Правильно!\n");
                score++;
            } else {
                System.out.println("❌ Неправильно. Правильна відповідь: " + correctAnswers[i] + "\n");
            }
        }

        System.out.println("Вікторина завершена!");
        System.out.println("Ваш результат: " + score + " з " + questions.length);

        scanner.close();
    }
}
