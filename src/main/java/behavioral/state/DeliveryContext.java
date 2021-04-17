package behavioral.state;

import lombok.Data;

@Data
public class DeliveryContext {
    private PackageState currentState;
    private String packageId;


    public DeliveryContext(PackageState currentState, String packageId) {
        this.currentState = currentState;
        this.packageId = packageId;

        if(currentState == null) {
            this.currentState = InitializedState.getInstance();
        }
    }

    public void updateDeliveryStatus() {
        this.currentState.transferToNextState(this);
    }
}
