package behavioral.state;

public class ShippedState implements PackageState{

    private static ShippedState shippedStateInstance = new ShippedState();

    private ShippedState() {};

    public static ShippedState getInstance() {
        System.out.println("Setting Shipped State");
        return shippedStateInstance;
    }

    public void transferToNextState(DeliveryContext context){
        System.out.println("Transfer Shipped-InTransition");
        context.setCurrentState(InTransitionState.getInstance());
    }
}
