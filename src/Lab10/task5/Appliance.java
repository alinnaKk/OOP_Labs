package Lab10.task5;

abstract class Appliance {
    protected String brand;

    public String getBrand() {
        return brand;
    }

    public abstract void turnOn();
}
