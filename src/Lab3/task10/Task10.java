package Lab3.task10;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть розмір масиву:");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.print("Заповніть масив: ");
        for(int i = 0; i < size; i++) {
            System.out.print("Елемент " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Дублікати: ");
        boolean hasDuplicates = false;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] == array[j]) {
                    System.out.print(array[i] + " ");
                    hasDuplicates = true;
                    break;
                }
            }
        }

        if (!hasDuplicates) {
            System.out.print("Дублікатів не знайдено.");
        }

        scanner.close();
    }
}
