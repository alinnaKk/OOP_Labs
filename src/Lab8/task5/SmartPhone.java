package Lab8.task5;

public class SmartPhone extends Phone {

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("The smartphone is ready to work!");
    }

    public void browseInternet() {
        System.out.println("Browsing the internet...");
    }

}
