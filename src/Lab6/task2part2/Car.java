package Lab6.task2part2;

public class Car {
    String mark;
    String model;
    double speed;

    public Car(String mark, String model) {
        this.mark = mark;
        this.model = model;
        this.speed = 0;
    }

    void accelerationSpeed(int a) {
        speed =+ a;
    }

    void info() {
        System.out.println("Марка:" + mark + ", модель: " + model + ", швидкість: " + speed);
    }
}
