package Lab9.tack3;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(),
                new Triangle(),
                new Square(),
                new Shape(),
                new Triangle(),
                new Triangle(),
                new Circle()
        };

        for (Shape shape : shapes ) {
            shape.draw();

        }
    }
}
