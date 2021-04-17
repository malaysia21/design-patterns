package behavioral.state;

public class InitializedState implements PackageState{

    private static InitializedState initializedStateInstance = new InitializedState();

    private InitializedState() {};

    public static InitializedState getInstance() {
        System.out.println("Setting Initialized State");
        return initializedStateInstance;
    }

    public void transferToNextState(DeliveryContext context){
        System.out.println("Transfer Initialized-Acknowledged");
        context.setCurrentState(AcknowledgedState.getInstance());
    }
}
