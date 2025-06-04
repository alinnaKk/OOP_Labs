package Lab10.task5;

public class WasherDryer extends Appliance implements Washable, Dryable {

    public WasherDryer(String brand) {
        super.brand = brand;
    }

    @Override
    public void turnOn() {
        System.out.printf( "Пральна машина [%s] увімкнена", super.getBrand());
        System.out.println();
    }

    @Override
    public void wash() {
        System.out.println( "Прання запущено...");
    }

    @Override
    public void dry() {
        System.out.println("Сушіння запущено...");
    }
}
