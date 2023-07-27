package algorithms.oj.others.ths0707;

/**
 * @author yangningkai
 * @create 2022-07-07 19:16
 **/

public class Singleton {
    static volatile Singleton instance;
    static Object lock = new Object();

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (lock) {
                instance = new Singleton();
            }
        }
        return instance;
    }
}
