package Lab9.tack4;

public class Main {
    public static void main(String[] args) {

        Shape[] shapes = {
                new Circle(10),
                new Circle(3),
                new Rectangle(10, 77.8 ),
                new Rectangle(26.5, 10),
                new Shape()
        };

        for (Shape shape: shapes) {
            System.out.println("Обчислена площа = " + shape.area());
        }

    }
}
