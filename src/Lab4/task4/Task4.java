package Lab4.task4;

public class Task4 {
    public static void printInfo(String name) {
        System.out.printf("Name: <%s>%n", name);
    }

    public static void printInfo(String name, int age) {
        System.out.printf("Name: <%s>, Age: <%d>%n", name, age);
    }

    public static void main(String[] args) {
        printInfo("Alina");
        printInfo("Alina", 18);
    }
}
