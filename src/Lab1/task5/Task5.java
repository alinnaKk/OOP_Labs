package Lab1.task5;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age:");
        int age = scanner.nextInt();
        //scanner.nextLine();

        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();
        //scanner.nextLine();

        System.out.print("Are you a student? (yes/no): ");
        //boolean isStudent = scanner.nextBoolean();

        boolean isStudent = scanner.nextLine() == "yes";

        //виводимо
        System.out.println("Name: [" + name + "]");
        System.out.println("Age: [" + age + "]");
        System.out.println("Height: [" + height + "]" );
        System.out.println("Student: [" + (isStudent) + "]");
        scanner.close();


    }
}
