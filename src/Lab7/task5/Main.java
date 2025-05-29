package Lab7.task5;

public class Main {
    public static void main(String[] args) {
        Clock clock = new Clock();
        clock.setHours(23);
        clock.setMinutes(59);
        clock.setSeconds(58);

        for (int i = 0; i < 5; i++) {
            clock.displayTime();
            clock.tick();
        }
    }
}