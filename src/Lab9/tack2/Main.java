package Lab9.tack2;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog(),
                new Cat(),
                new Cat(),
                new Cat(),
                new Dog(),
                new Dog(),
                new Cat(),
                new Dog()
        };

        for (Animal animal : animals) {
            animal.makeSound();
        }

    }
}