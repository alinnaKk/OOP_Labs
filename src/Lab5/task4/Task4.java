package Lab5.task4;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numCube = 0;
        int sum = 0;

        System.out.print("Введіть кількість кубиків: ");
        numCube = scanner.nextInt();

        if (numCube <= 0) {
            System.out.println("Помилка: кількість має бути більше нуля.");
            scanner.close();
            return;
        } else {
            int i = 1;
            while (i <= numCube) {
                int roll = random.nextInt(6) + 1;
                System.out.println("Кубик #" + i + ":");
                print(roll);
                sum += roll;
                i++;
            }
        }

        System.out.println("Сума всіх кидків: " + sum);
        scanner.close();
    }

    static void print(int roll) {
        switch (roll) {
            case 1 -> System.out.println("""
                    +-------+
                    |       |
                    |   *   |
                    |       |
                    +-------+
                    """);
            case 2 -> System.out.println("""
                    +-------+
                    | *     |
                    |       |
                    |     * |
                    +-------+
                    """);
            case 3 -> System.out.println("""
                    +-------+
                    | *     |
                    |   *   |
                    |     * |
                    +-------+
                    """);
            case 4 -> System.out.println("""
                    +-------+
                    | *   * |
                    |       |
                    | *   * |
                    +-------+
                    """);
            case 5 -> System.out.println("""
                    +-------+
                    | *   * |
                    |   *   |
                    | *   * |
                    +-------+
                    """);
            case 6 -> System.out.println("""
                    +-------+
                    | *   * |
                    | *   * |
                    | *   * |
                    +-------+
                    """);
        }
    }
}


