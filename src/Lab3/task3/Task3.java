package Lab3.task3;

public class Task3 {
    public static void main(String[] args) {
        int number = 7;

        System.out.println("Таблиця множення для числа " + number + " (for):");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", number, i, number * i);
        }

        System.out.println("Таблиця множення для числа " + number + " (while):");
        int i = 1;
        while (i <= 10) {
            System.out.printf("%d x %d = %d%n", number, i, number * i);
            i++;
        }

        System.out.println("Таблиця множення для числа " + number + " (do-while):");
        int j = 1;
        do{
            System.out.printf("%d x %d = %d%n", number, j, number * j);
            j++;

        } while(j <= 10);

    }
}
