package Lab9.tack5;

public class EmailNotification extends Notification {

    @Override
    public void send(String message) {
        System.out.printf( "Sending email: <%s>", message);
    }
}
