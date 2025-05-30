package Lab10.task3;

public class Sparrow extends Bird implements Flyable {

    @Override
    public void makeSound() {
        System.out.println("Цвіріньк-цвіріньк!");
    }

    @Override
    public void fly() {
        System.out.println("Горобець літає");
    }

}
