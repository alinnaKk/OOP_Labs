package Lab2.task7;

import java.util.Random;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        //1. Користувач вводить мінімальне та максимальне значення.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть мінімальне та максимальне значення: ");
        int min = scanner.nextInt();
        int max = scanner.nextInt();

        //2. Програма генерує випадкове число у цьому діапазоні.
        Random random = new Random();
        int randomNum = random.nextInt(max - min + 1) + min;
        System.out.println("Згенероване число: " + randomNum);
        //3. Визначає, чи число парне чи непарне, використовуючи тернарний оператор.
        String result = (randomNum % 2 == 0) ? "парне" : "не парне";
        //4. Виводить результат у форматі printf().
        System.out.printf("Число: %d (%s)%n", randomNum, result);
        scanner.close();
    }
}
