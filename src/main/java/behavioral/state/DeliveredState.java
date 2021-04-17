package behavioral.state;

public class DeliveredState implements PackageState{

    private static DeliveredState deliveredStateInstance = new DeliveredState();

    private DeliveredState() {};

    public static DeliveredState getInstance() {
        System.out.println("Setting Delivered State");
        return deliveredStateInstance;
    }

    public void transferToNextState(DeliveryContext context){
        System.out.println("Package Delivered");
    }
}
