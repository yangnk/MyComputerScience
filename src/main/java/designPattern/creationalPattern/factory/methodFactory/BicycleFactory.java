package designPattern.creationalPattern.factory.methodFactory;

/**
 * Created by yangnk23900 on 2018/11/26.
 */
public class BicycleFactory extends CarFactory {
    Car car = null;

    void run() {
        car = new Bicycle();
        car.drive();
    }

    @Override
    public Car newInstance() {
        return null;
    }
}
