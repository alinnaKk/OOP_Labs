package Lab6.task3;

public class Animal {
    String name;
    String sound;

    // Конструктор
    Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    public void makeSound() {
        System.out.println(name + " видає звук " + sound + ". \n");
    }
}
