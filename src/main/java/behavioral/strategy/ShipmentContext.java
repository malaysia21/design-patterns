package behavioral.strategy;

import lombok.Data;

@Data
public class ShipmentContext {

    private IShipmentStrategy IShipmentStrategy;

    public void deliver(String packageContent) {
        IShipmentStrategy.deliveryPackage(packageContent);
    }
}
