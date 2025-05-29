package Lab8.task4;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(16);
        Rectangle rectangle1 = new Rectangle(12.5, 10);

        System.out.println("Площа круга = " + circle1.area());

        System.out.println("Площа прямокутника = " + rectangle1.area());

    }
}
