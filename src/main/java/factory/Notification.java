package factory;

public abstract class Notification {
    private NotificationType notificationType;

    public Notification(NotificationType notificationType) {
        this.notificationType = notificationType;
    }

    public abstract void createNotification();
}
