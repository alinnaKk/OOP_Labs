package Lab9.tack1;

public class Main {
    public static void main(String[] args) {
        Calculator obj = new Calculator();

        System.out.println(obj.add(2, 3));
        System.out.println(obj.add(1.5, 9.3));
        System.out.println(obj.add(10, 34, 98));
    }
}
