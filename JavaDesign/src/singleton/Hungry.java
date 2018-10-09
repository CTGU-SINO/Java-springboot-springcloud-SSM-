package singleton;

public class Hungry {
    private static Hungry ourInstance = new Hungry();

    public static Hungry getInstance() {
        return ourInstance;
    }

    private Hungry() {
    }
}
