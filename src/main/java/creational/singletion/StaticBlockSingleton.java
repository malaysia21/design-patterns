package creational.singletion;

public class StaticBlockSingleton {

    private static final StaticBlockSingleton INSTANCE;

    static {
        try {
            INSTANCE = new StaticBlockSingleton();
        } catch (Exception ex) {
            throw new RuntimeException("Exception occurred", ex);
        }
    }

    public static StaticBlockSingleton getInstance() {
        return INSTANCE;
    }

    private StaticBlockSingleton() { }
}
