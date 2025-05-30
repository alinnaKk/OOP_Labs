package Lab9.tack5;

public class Main {

    public static void main(String[] args) {

        Notification[] notifications = {
                new Notification(),
                new EmailNotification(),
                new SMSNotification(),
                new PushNotification()
        };

        for (Notification notification: notifications) {
            notification.send("Hello, user!");
            System.out.println();
        }
    }
}