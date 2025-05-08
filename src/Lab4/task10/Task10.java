package Lab4.task10;

public class Task10 {
    public static void printNumbers(String message, int... numbers) {
        System.out.print(message + ": ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Різні виклики методу
        printNumbers("Список чисел №1", 1, 2, 3);
        printNumbers("Список чисел №2", 5);
        printNumbers("Список чисел №3", 10, 20, 30, 40, 50);
    }
}