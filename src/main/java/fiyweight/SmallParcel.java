package fiyweight;

public class SmallParcel  implements Parcel{
    final private ParcelSize parcelSize = ParcelSize.SMALL;
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
        System.out.println("Preparing SMALL parcel - row: " + this.row + " column: " + this.column);
    }
}
