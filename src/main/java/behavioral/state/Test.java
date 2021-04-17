package behavioral.state;

public class Test {

    public static void main(String[] args) {
        DeliveryContext deliveryContext = new DeliveryContext(null, "ORD-1234");

        deliveryContext.updateDeliveryStatus();
        deliveryContext.updateDeliveryStatus();
        deliveryContext.updateDeliveryStatus();
        deliveryContext.updateDeliveryStatus();
        deliveryContext.updateDeliveryStatus();
    }
}
