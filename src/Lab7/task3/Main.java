package Lab7.task3;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Subaru", "Forester", 80);
        Car car2 = new Car("BMW", "X5", 100);

        car1.displayInfo();
        car1.accelerate(20);
        car1.displayInfo();
        car1.brake(50);
        car1.displayInfo();

        System.out.println();

        car2.displayInfo();
        car2.accelerate(-20); // буде помилка
        car2.displayInfo();
        car2.brake(-50); // буде помилка
        car2.displayInfo();

    }
}
