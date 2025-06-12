package Lab12.version3.handlers;

import java.util.Scanner;

public class UserInputHandler {
    private static final Scanner scanner = new Scanner(System.in);

    public static String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
}
