package structural.bridge;

import lombok.Data;

@Data
public class ParcelShippingAbstractionImpl implements ParcelShippingAbstraction {

    private final ParcelShipping parcelShippingProvider;

    @Override
    public boolean preparePackage(String packageNumber) {
        return parcelShippingProvider.preparePackage(packageNumber);
    }

    @Override
    public void sendPackage(String packageNumber) {
        parcelShippingProvider.sendPackage(packageNumber);
    }

    @Override
    public boolean acceptReturn(String packageNumber) {
        return false;
    }

}
