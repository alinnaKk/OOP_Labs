package Lab2.task6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число: ");
        double number = scanner.nextDouble();

        double sqrt = Math.sqrt(number);
        long round = Math.round(number);
        double squared = Math.pow(number, 2);
        double sin = Math.sin(number);

        System.out.println("Квадратний корінь: " + sqrt);
        System.out.println("Округлене число: " + round);
        System.out.println("Число в квадраті: " + squared);
        System.out.println("Синус числа: " + sin);

        scanner.close();
    }
}
