package Lab4.task8;

public class Task8 {
    static int counter = 0;

    public static void setCounter(int counter) {
        System.out.println(counter);
    }

    public static void main(String[] args) {
        System.out.print("Вивід методу void setCounter: ");
        setCounter(500);

        System.out.print("Вивід глобальної змінної counter: " + counter);
    }
}
