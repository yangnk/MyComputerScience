package designPattaren.singleInstance;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-15 下午10:49
 **/
public class SingleInstance1 {
    private static final SingleInstance1 SINGLE_INSTANCE_1 = new SingleInstance1();

    private SingleInstance1() { }
    public static SingleInstance1 getSingleInstance1Instance() {
        return SINGLE_INSTANCE_1;
    }
}
