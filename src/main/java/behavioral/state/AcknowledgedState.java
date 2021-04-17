package behavioral.state;

public class AcknowledgedState implements PackageState{

    private static AcknowledgedState acknowledgedStateInstance = new AcknowledgedState();

    private AcknowledgedState() {};

    public static AcknowledgedState getInstance() {
        System.out.println("Setting Acknowledged State");
        return acknowledgedStateInstance;
    }

    public void transferToNextState(DeliveryContext context){
        System.out.println("Transfer Acknowledged-Shipped");
        context.setCurrentState(ShippedState.getInstance());
    }
}
