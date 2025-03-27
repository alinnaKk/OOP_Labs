package Lab2.task5;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть рядок: ");
        String userText = scanner.nextLine();

        int length = userText.length();

        System.out.println("Довжина рядка: " +  length);
        System.out.println("Перший символ: " +  userText.charAt(0));
        System.out.println("Перший символ: " +  userText.charAt(length - 1));
        System.out.println("Верхній регістр: " +  userText.toUpperCase());
        System.out.println("Підрядок: " +  userText.substring(0,3));
        System.out.println("Чи містить слово 'Java'?: " + userText.contains("Java"));

        scanner.close();
    }
}
