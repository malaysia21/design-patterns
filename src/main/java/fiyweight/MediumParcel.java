package fiyweight;

public class MediumParcel implements Parcel{
    final private ParcelSize parcelSize = ParcelSize.MEDIUM;
    private int row;
    private int column;


    @Override
    public void setParcelLocationRow(int row) {
        this.row = row;
    }

    @Override
    public void setParcelLocationColumn(int column) {
        this.column = column;
    }

    @Override
    public void prepareParcel() {
        System.out.println("Preparing MEDIUM parcel - row: " + this.row + " column: " + this.column);
    }
}
