package Lab3.task9;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        int[] array = {23, 45, 12, 67, 89, 34, 56, 78, 90, 11};

        System.out.print("Початковий масив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть індекс(0-9): ");
        int index = scanner.nextInt();

        if (index < 0 || index >= 10) {
            System.out.println("Некоректний індекс!");
        } else {
            System.out.print("Введіть нове значення: ");
            int newValue = scanner.nextInt();

            array[index] = newValue;

            System.out.print("Оновлений масив: ");
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
