package Lab4.task5;

import static java.lang.Math.PI;

public class Task5 {
    public static void calculateArea(double radius) {
        double s = PI * radius;
        System.out.println("Площа кола = " + s );
    }

    public static void calculateArea(double length, double width) {
        double s = length * width;
        System.out.println("Площа прямокутника = " + s );
    }

    public static void main(String[] args) {

        calculateArea(60);
        System.out.println();
        calculateArea(7, 100);

    }
}
