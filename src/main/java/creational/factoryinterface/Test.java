package creational.factoryinterface;

public class Test {

    public static void main(String[] args) {
        System.out.println(NotificationFactory.buildNotification(NotificationType.PRODUCT));
        System.out.println(NotificationFactory.buildNotification(NotificationType.CLIENT));
    }
}
