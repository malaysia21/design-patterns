package behavioral.strategy;

public class ParcelStrategyI implements IShipmentStrategy {

    public void deliveryPackage(String packageContent) {
        System.out.println("Deliver package to Parcel: " + packageContent);
    }
}
