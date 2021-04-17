package structural.bridge;

public interface ParcelShippingAbstraction {

    boolean preparePackage(String packageNumber);
    void sendPackage(String packageNumber);
    boolean acceptReturn(String packageNumber);
}
