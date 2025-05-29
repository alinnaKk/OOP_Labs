package Lab8.task3;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Лукас");
        Animal animal = new Animal("Річард");

        dog1.walk();
        dog1.makeSound();

        animal.makeSound();
    }
}
