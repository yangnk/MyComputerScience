package designPattaren.singleInstance;

/**
 * ${为了避免高并发情况下，单例还没有初始化完成又被初始化}
 *
 * @author yangningkai
 * @create 2018-12-15 下午10:51
 **/
public class SingleInstance2 {
    private static SingleInstance2 SINGLE_INSTANCE_2 = null;

    private SingleInstance2() {}

    synchronized public static SingleInstance2 getSingleInstance2() {
        if (SINGLE_INSTANCE_2 == null) {
            SINGLE_INSTANCE_2 = new SingleInstance2();
        }
        return SINGLE_INSTANCE_2;
    }
}
