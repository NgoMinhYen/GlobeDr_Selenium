public class Singleton {

    private static final Singleton INSTANCE = new Singleton();

    // Private constructor to avoid client applications to use constructor
    private Singleton() {

    }

    public static Singleton getInstance() {
        return INSTANCE;
    }
}