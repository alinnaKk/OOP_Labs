package Lab3.task7;
import java.util.Arrays;
import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        Random random = new Random();

        int size = 10;
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(50) + 1;
        }
        System.out.println("Масив до сортування: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        Arrays.sort(array);

        System.out.println("\nМасив після сортування:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
