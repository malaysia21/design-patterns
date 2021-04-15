package creational.factoryinterface;

public class ProductNotification implements Notification {
    private NotificationType notificationType;

    ProductNotification() {
        this.notificationType = NotificationType.PRODUCT;
        createNotification();
    }

    public void createNotification() {
        System.out.println("Creating Notification: PRODUCT");
    }
}
