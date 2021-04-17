package behavioral.state;

public class InTransitionState implements PackageState{

    private static InTransitionState inTransitionStateInstance = new InTransitionState();

    private InTransitionState() {};

    public static InTransitionState getInstance() {
        System.out.println("Setting InTransition State");
        return inTransitionStateInstance;
    }

    public void transferToNextState(DeliveryContext context){
        System.out.println("Transfer InTransition-Delivered");
        context.setCurrentState(DeliveredState.getInstance());
    }
}
