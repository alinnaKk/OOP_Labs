package Lab3.task8;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Введіть число, яке ви шукаєте: ");
        int userNum = scanner.nextInt();

        int[] array = {23, 45, 12, 67, 89, 34, 56, 78, 90, 11};

        boolean found = false;
        for(int num:array) {
            if(num == userNum){
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Число знайдено!");
        } else {
            System.out.println("Число не знайдено.");
        }

        scanner.close();
    }
}

