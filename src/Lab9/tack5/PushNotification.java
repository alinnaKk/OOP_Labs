package Lab9.tack5;

public class PushNotification extends Notification {

    @Override
    public void send(String message) {
        System.out.printf( "Sending push notification: <%s>", message);
    }
}
