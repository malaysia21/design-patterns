package structural.fiyweight;

import java.util.HashMap;

public class ParcelFactory {

    private static final HashMap<String, Parcel> parcelMap = new HashMap<>();

    public static Parcel prepareSmallParcel(int row, int column){
        validateRowColumn(row, column, ParcelSize.SMALL);
        String key = ParcelSize.SMALL.toString().concat("-").concat(String.valueOf(row)).concat("-").concat(String.valueOf(column));
        Parcel parcel = parcelMap.get(key);

        if(parcel != null) {
            return parcel;
        } else {
            parcel = new SmallParcel();
            parcel.setParcelLocationRow(row);
            parcel.setParcelLocationColumn(column);
            parcelMap.put(key, parcel);
        }

        return parcel;
    }

    public static Parcel prepareMediumParcel(int row, int column){
        validateRowColumn(row, column, ParcelSize.MEDIUM);
        String key = ParcelSize.MEDIUM.toString().concat("-").concat(String.valueOf(row)).concat("-").concat(String.valueOf(column));
        Parcel parcel = parcelMap.get(key);

        if(parcel != null) {
            return parcel;
        } else {
            parcel = new MediumParcel();
            parcel.setParcelLocationRow(row);
            parcel.setParcelLocationColumn(column);
            parcelMap.put(key, parcel);
        }

        return parcel;
    }

    public static Parcel prepareLargeParcel(int row, int column){
        validateRowColumn(row, column, ParcelSize.LARGE);
        String key = ParcelSize.LARGE.toString().concat("-").concat(String.valueOf(row)).concat("-").concat(String.valueOf(column));
        Parcel parcel = parcelMap.get(key);

        if(parcel != null) {
            return parcel;
        } else {
            parcel = new LargeParcel();
            parcel.setParcelLocationRow(row);
            parcel.setParcelLocationColumn(column);
            parcelMap.put(key, parcel);
        }

        return parcel;
    }

    private static void validateRowColumn(int row, int column, ParcelSize parcelSize) {
        if(ParcelSize.SMALL.equals(parcelSize) && !(row == 3 && column<10 && column > 0)){
            throw new RuntimeException("Invalid parcel position");
        }
        if(ParcelSize.MEDIUM.equals(parcelSize) && !(row == 2 && column< 10 && column > 0)){
            throw new RuntimeException("Invalid parcel position");
        }
        if(ParcelSize.LARGE.equals(parcelSize) && !(row == 1 && column< 10 && column > 0)){
            throw new RuntimeException("Invalid parcel position");
        }
    }
}
