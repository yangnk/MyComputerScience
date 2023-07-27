package designPattern.creationalPattern.factory.methodFactory;

/**
 * Created by yangnk23900 on 2018/11/26.
 */
public class AutomobileFactory extends CarFactory {
    Car car = null;

    @Override
    void run() {
        car = new Automobile();
        car.drive();
    }

    @Override
    public Automobile newInstance() {
        return new Automobile();
    }

    ;
}
