package Lab3.task5;

import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть розмір масиву:");
        int N = scanner.nextInt();

        int[] array = new int[N];
        for (int i=0; i < N; i++) {
            array[i] = random.nextInt(100) + 1;
        }
        System.out.println("Масив з випадковими числами:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
