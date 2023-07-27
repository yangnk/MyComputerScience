package designPattern.creationalPattern.factory.methodFactory;

/**
 * Created by yangnk23900 on 2018/11/26.
 */
public abstract class CarFactory {
    abstract void run();

    public abstract Car newInstance();
}
