package Lab7.task3;

public class Car {
    private String brand;
    private String model;
    private double speed;

    public Car(String brand, String model, double speed) {
        this.model = model;
        this.brand = brand;
        this.speed = speed;
    }

    public void accelerate(int value) {
        if (value >= 0)
            speed += value;
        else
            System.out.println("Помилка! Прискорення не має бути від'ємним! ");
    }

    public void brake(int value) {
        if (speed >= 0 && value > 0) {
            speed -= value;
        }
        else
            System.out.println("Помилка! Швидкість не має бути від'ємною! ");
    }

    public void displayInfo() {
        System.out.println("Бренд автівки: " + brand + ", модель: " + model + ", швидкість: " + speed);
    }
}
