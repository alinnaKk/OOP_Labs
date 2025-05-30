package Lab9.tack5;

public class SMSNotification extends Notification {

    @Override
    public void send(String message) {
        System.out.printf("Sending SMS: <%s>", message);
    }
}