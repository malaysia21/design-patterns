package creational.factory;

public class ClientNotification extends Notification {

    ClientNotification() {
        super(NotificationType.CLIENT);
        createNotification();
    }

    public void createNotification() {
        System.out.println("Creating Notification: CLIENT");
    }
}
