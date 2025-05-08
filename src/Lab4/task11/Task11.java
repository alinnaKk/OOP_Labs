package Lab4.task11;

public class Task11 {
    public static int findMax(int... numbers) {
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // Виклики методу з різними наборами чисел
        System.out.println("Найбільше число: " + findMax(3, 7, 2, 9, 4));
        System.out.println("Найбільше число: " + findMax(10, 5, 4, 8, 100, 9, 63, 1));
    }
}
