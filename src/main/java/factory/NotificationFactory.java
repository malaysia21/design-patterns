package factory;

public class NotificationFactory {
    public static Notification buildNotification(NotificationType notificationType){
        switch (notificationType){
            case PRODUCT:
                return new ProductNotification();
            case CLIENT:
                return new ClientNotification();
            default:
                throw  new RuntimeException("Notification not implemented yet");
        }
    }
}
