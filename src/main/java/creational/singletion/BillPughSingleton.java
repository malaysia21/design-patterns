package creational.singletion;

public class BillPughSingleton {

    private BillPughSingleton() {
    }

    private static class LazySingleton{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public BillPughSingleton getInstance() {
        return LazySingleton.INSTANCE;
    }

}
