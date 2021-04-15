package behavioral.strategy;

public class CourierStrategyI implements IShipmentStrategy {

    public void deliveryPackage(String packageContent) {
        System.out.println("Deliver package with Courier: " + packageContent);
    }
}
