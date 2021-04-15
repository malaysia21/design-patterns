package structural.fiyweight;

public class LargeParcel implements Parcel{
    final private ParcelSize parcelSize = ParcelSize.LARGE;
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
        System.out.println("Preparing LARGE parcel - row: " + this.row + " column: " + this.column);
    }
}
