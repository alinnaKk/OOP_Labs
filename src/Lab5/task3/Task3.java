package Lab5.task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double firstNumber, secondNumber, result = 0;
        String operator;

        System.out.print("Введіть перше число: ");
        firstNumber = scanner.nextDouble();

        System.out.print("Введіть оператор (+, -, *, /, ^): ");
        operator = scanner.next();

        System.out.print("Введіть друге число: ");
        secondNumber = scanner.nextDouble();

        boolean validOperation = true;

        switch (operator) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                // 7. Обробіть випадок ділення на нуль
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                } else {
                    System.out.println("Помилка: не можна ділити на нуль!");
                    validOperation = false;
                }
                break;
            case "^":
                result = Math.pow(firstNumber, secondNumber);
                break;
            default:
                System.out.println("Помилка: некоректний оператор.");
                validOperation = false;
        }

        if (validOperation) {
            System.out.printf("Результат: %.2f\n", result);
        }

        scanner.close();
    }
}

