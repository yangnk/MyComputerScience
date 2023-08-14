package designPattern.creationalPattern.singleton.v2;

/**
 * @author yangnk
 * @desc
 * @date 2023/08/13 16:46
 **/
public class Singleton {
    //volatile 保障可见性
    private volatile static Singleton singleton;

    //private构造方法，无法通过new来实例化对象
    private Singleton() { }

    public static Singleton getSingleton() {
        if (singleton == null) {
            //用synchronized加锁，只允许并发情况下进行一个实例化操作
            synchronized (Singleton.class) {
                //需要再次判断singletonTest == null，避免指令重排导致初始化和分配内存失序
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Singleton singleton = Singleton.getSingleton();
            System.out.println("singletonTest.hashCode() = " + singleton.hashCode());
        }
    }
}