package Lab6.task4;

public class Main {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();

        counter1.increment();
        counter1.increment();
        counter1.increment();
        counter1.increment();

        counter2.increment();

        System.out.println("Об'єкт counter1 = " + counter1.getCount());
        System.out.println("Об'єкт counter2 = " + counter2.getCount());
        System.out.println("Об'єкт counter3 = " + counter3.getCount());

        // static Counter
        StaticCounter.increment();
        StaticCounter.increment();
        StaticCounter.increment();
        StaticCounter.increment();
        StaticCounter.increment();

        System.out.println("static Counter = " + StaticCounter.getCount());

        // Для звичайного класу треба обов'язково створювати нові об'єкти для яких лічильник рахується окремо,
        // тобто кожен об'єкт має свою копію змінних.
        // А статичний клас працює без об'єктів(викликаємо StaticCounter) і всі дані спільні для всіх, бо немає рвзних об'єктів.
    }
}
