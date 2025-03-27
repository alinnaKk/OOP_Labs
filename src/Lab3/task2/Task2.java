package Lab3.task2;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // ініціалізувати вхідні дані (генератор чисел, сканер, змінні)
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min;
        int max;

        // Отримати дані від користувача
        System.out.println("Гра Відгадай число!");
        System.out.print("Введіть мінімальне: ");
        min = scanner.nextInt();
        System.out.print("Введіть максимальне: ");
        max = scanner.nextInt();

        int randomNumber = random.nextInt(min, max);
        System.out.printf("Вгадайте число у проміжку від %d до %d: ", min, max);

        // do while логіку по обробці спроб користувача
        do {
            System.out.print("Введіть число: ");
            guess = scanner.nextInt();
            attempts++;
            if (guess < randomNumber) {
                System.out.println("Спробуйте більше число!");
            } else if (guess > randomNumber) {
                System.out.println("Спробуйте менше число!");
            } else {
                System.out.println("Вітаємо! Вивгадали загадане число!!!");
                System.out.println("Ви використали " + attempts + " спроб(и)");
            }
        } while (guess != randomNumber);
        // завершення програми
        System.out.println("Завершення програми!");
    }
}