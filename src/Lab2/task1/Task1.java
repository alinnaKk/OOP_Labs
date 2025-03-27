package Lab2.task1;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число(додатне чи від'ємне): ");
        int userNumber = scanner.nextInt();
        scanner.close();

        if(userNumber >= 0) {
            System.out.println("Ваше число додатне!");
        } else {
            System.out.println("Ваше число від'ємне!");
        }
    }
}
