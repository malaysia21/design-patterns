package structural.bridge;

public interface ParcelShipping {

    boolean preparePackage(String packageNumber);
    void sendPackage(String packageNumber);
    void verifyPackage(String packageNumber);
}
