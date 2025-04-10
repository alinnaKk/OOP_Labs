package Lab4.task7;

public class Task7 {
    static int counter = 0;

    public static void increment() {
        System.out.println(counter++);
    }

    public static void main(String[] args) {
        increment();
        increment();
        increment();
        increment();
        increment();
        System.out.println("Значення counter: " + counter);
    }
}

