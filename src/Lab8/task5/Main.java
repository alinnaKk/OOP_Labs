package Lab8.task5;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Tablet tablet1 = new Tablet();
        SmartPhone smartPhone1 = new SmartPhone();

        phone1.turnOn();
        phone1.makeCall();
        System.out.println();

        tablet1.turnOn();
        tablet1.watchVideo();
        System.out.println();

        smartPhone1.turnOn();
        smartPhone1.browseInternet();

    }
}
