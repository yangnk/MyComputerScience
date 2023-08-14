package designPattern.creationalPattern.factory.methodFactory.v2;

/**
 * @author yangnk
 * @desc
 * @date 2023/08/13 18:08
 **/
public class BicycleFactory implements CarFactory{
    Bicycle bicycle;
    @Override
    public Car getCar() {
        bicycle = new Bicycle();
        return bicycle;
    }
}