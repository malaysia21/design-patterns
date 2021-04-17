package structural.bridge;

public class ParcelShippingProviderTwo implements ParcelShipping {

    public boolean preparePackage(String packageNumber) {
        System.out.println("Preparing package - Provider Two");
        return true;
    }
    public void sendPackage(String packageNumber) {
        System.out.println("Sending package - Provider Two");
    }

    @Override
    public void verifyPackage(String packageNumber) {
        System.out.println("Package verification - Provider Two");
    }
}
