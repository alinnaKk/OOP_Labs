package Lab4.task9;

public class Task9 {
    public static int sum(int... numbers) {
        int result = 0;
        for (int num : numbers) {
            result += num;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Сума (1, 2, 3): " + sum(1, 2, 3));
        System.out.println("Сума (9, 9, 4, 1): " + sum(9, 9, 4, 1));
        System.out.println("Сума (7, 14, 21, 28): " + sum(7, 14, 21, 28));
    }
}
