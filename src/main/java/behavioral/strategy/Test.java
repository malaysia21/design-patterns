package behavioral.strategy;

public class Test {

    public static void main(String[] args) {
        String packageContent = "Books";

        ShipmentContext shipmentContext = new ShipmentContext();
        shipmentContext.setIShipmentStrategy(chooseShipmentStrategy(ShipmentType.PARCEL));
        shipmentContext.deliver(packageContent);

        shipmentContext.setIShipmentStrategy(chooseShipmentStrategy(ShipmentType.COURIER));
        shipmentContext.deliver(packageContent);

    }

    private static IShipmentStrategy chooseShipmentStrategy(ShipmentType shipmentType) {
        switch(shipmentType){
            case PARCEL:
               return new ParcelStrategyI();
            case COURIER:
               return (new CourierStrategyI());
            default:
                throw new RuntimeException("Shipment type nit implemented");
        }
    }
}
