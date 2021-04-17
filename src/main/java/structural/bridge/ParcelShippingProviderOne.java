package structural.bridge;

public class ParcelShippingProviderOne implements ParcelShipping {

    public boolean preparePackage(String packageNumber) {
        System.out.println("Preparing package - Provider One");
        return true;
    }
    public void sendPackage(String packageNumber) {
        System.out.println("Sending package - Provider One");
    }

    @Override
    public void verifyPackage(String packageNumber) {
        System.out.println("Package verification - Provider One");
    }
}
