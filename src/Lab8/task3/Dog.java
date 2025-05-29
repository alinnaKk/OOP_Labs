package Lab8.task3;

public class Dog extends Mammal {

    public Dog(String name) {
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }

}
