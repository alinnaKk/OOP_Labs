package Lab10.task1;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.makeSound();
        dog.sleep();

        System.out.println();

        cat.makeSound();
        cat.sleep();
    }
}