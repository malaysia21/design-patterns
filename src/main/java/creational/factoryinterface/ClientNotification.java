package creational.factoryinterface;

public class ClientNotification implements Notification {
    private NotificationType notificationType;

    ClientNotification() {
        this.notificationType = NotificationType.CLIENT;
        createNotification();
    }

    public void createNotification() {
        System.out.println("Creating Notification: CLIENT");
    }
}
