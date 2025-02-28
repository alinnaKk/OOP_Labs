package Lab1.task6;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть першу сторону прямокутника(ширину): ");
        int a = scanner.nextInt();

        System.out.print("Введіть першу сторону прямокутника(довжину): ");
        int b = scanner.nextInt();

        //
        System.out.print("Площа прямокутника = ");
        System.out.print(a * b);
        scanner.close();
    }
}