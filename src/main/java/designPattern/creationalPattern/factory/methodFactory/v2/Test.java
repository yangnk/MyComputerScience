package designPattern.creationalPattern.factory.methodFactory.v2;

/**
 * @author yangnk
 * @desc
 * @date 2023/08/13 18:10
 **/
public class Test {
    public static void main(String[] args) {
        CarFactory factory = new AutomobileFactory();
        CarFactory factory1 = new BicycleFactory();
        Car car = factory.getCar();
        Car car1 = factory1.getCar();

        car.drive();
        car1.drive();

    }
}