package Lab2.task3;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть два числа: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        int max = (a > b) ? a : b;
        System.out.println("Найбільше число це " + max);
    }
}
