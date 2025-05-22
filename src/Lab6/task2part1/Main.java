package Lab6.task2part1;

public class Main {

    // Частина 1: Процедурний підхід

    public static double accelerationSpeed(double speed, int a) {
        return speed + a;
    }

    public static void info(String mark, String model, double speed) {
        System.out.println("Марка: " + mark);
        System.out.println("Модель: " + model);
        System.out.println("Швидкість: " + speed);
    }

    public static void main(String[] args) {
        String mark = "Subaru";
        String model = "Forester";
        double speed = 0;


        speed = accelerationSpeed(speed, 95);
        info(mark, model, speed);
    }
}