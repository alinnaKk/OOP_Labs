package Lab6.task2;

public class Main {
    public static void main(String[] args) {
        // Частина 2: ООП підхід
        Car car1 = new Car("BMW", "X5");
        Car car2 = new Car("Subaru","Forester");

        car1.accelerationSpeed(110);
        car2.accelerationSpeed(120);

        car1.info();
        car2.info();
    }
}
