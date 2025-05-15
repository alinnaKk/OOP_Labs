package Lab6.task3;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];

        animals[0] = new Animal("Кіт", "Мяу");
        animals[1] = new Animal("Собака", "Гав");
        animals[2] = new Animal("Корова", "Муу");

        for (Animal animal : animals) {
            animal.makeSound();
        }

    }
}
