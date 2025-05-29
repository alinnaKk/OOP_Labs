package Lab8.task2;

public class Vehicle {
    protected double speed;

    public Vehicle(double speed) {
        this.speed = speed;
    }

    public void showSpeed() {
        System.out.println("Швидкість: " + speed);
    }

}
