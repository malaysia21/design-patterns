package factory;

public class ProductNotification extends Notification {

    ProductNotification() {
        super(NotificationType.PRODUCT);
        createNotification();
    }

    public void createNotification() {
        System.out.println("Creating Notification: PRODUCT");
    }
}
