package Lab3.task6;
import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        Random random = new Random();


        int size = 10;
        int[] array = new int[size];
        for (int i=0; i < size; i++) {
            array[i] = random.nextInt(100) + 1;
        }
        System.out.println("Масив:");
        for (int num : array) {
            System.out.print(num + " ");
        }
//знаходимо мінімальне та максимальне числа
        int min= size-1;
        int max=0;

        for (int i=0; i < size-1; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
//знаходимо середнє число
        for (int i=0; i< size-1; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        int sum = 0;
        int mid=1;
        for (int i=0; i<size-1; i++){
            sum+=array[i];
        }
        mid = sum/size;

//знаходимо кількість парних чисел
        int result = 0;
        for (int i=0; i<size-1; i++){
            if (array[i]%2 == 0) {
                result++;
            }
        }

        System.out.println("\nМінімальне число: "+ min);
        System.out.println("Максимальне число: "+ max);
        System.out.println("Середнє число: "+ mid);
        System.out.println("Кількість парних чисел: "+ result);

    }
}

