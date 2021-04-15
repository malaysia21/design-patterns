package structural.fiyweight;

public class Test {

    public static void main(String[] args) {
        Parcel parcelMedium1 = ParcelFactory.prepareMediumParcel(2, 8);
        parcelMedium1.prepareParcel();

        Parcel parcelMedium2 = ParcelFactory.prepareMediumParcel(2, 8);
        parcelMedium2.prepareParcel();

        Parcel parcelSmall1 = ParcelFactory.prepareSmallParcel(3, 8);
        parcelSmall1.prepareParcel();

        System.out.println(parcelMedium1);
        System.out.println(parcelMedium2);
        System.out.println(parcelSmall1);

    }
}
