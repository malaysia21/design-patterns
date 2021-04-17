package structural.bridge;

//decouple an abstraction from its implementation
public class Test {

    public static void main(String[] args) {
        ParcelShippingAbstraction parcelShipment = getParcelShippingAbstraction(Provider.PROVIDER_ONE);

        parcelShipment.preparePackage("100200");
        parcelShipment.sendPackage("100200");

        parcelShipment = getParcelShippingAbstraction( Provider.PROVIDER_TWO);

        parcelShipment.preparePackage("100201");
        parcelShipment.sendPackage("100201");


    }

    private static ParcelShippingAbstraction getParcelShippingAbstraction(Provider provider) {
        ParcelShippingAbstraction parcelShipment;
        switch (provider) {
            case PROVIDER_ONE:
                parcelShipment = new ParcelShippingAbstractionImpl(new ParcelShippingProviderOne());
                break;
            case PROVIDER_TWO:
                parcelShipment = new ParcelShippingAbstractionImpl(new ParcelShippingProviderTwo());
                break;
            default:
                throw new RuntimeException("Provider not supported");
        }
        return parcelShipment;
    }
}
