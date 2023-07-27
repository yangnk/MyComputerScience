package designPattern.creationalPattern.factory.simpleFactory;

/**
 * Created by yangnk23900 on 2018/11/26.
 */
public class CarFactory {
    Car car = null;

    CarFactory(String carTypy) {
        if (carTypy == "Bicycle") {
            car = new Bicycle();
            car.drive();
        }
        if (carTypy == "Automobile") {
            car = new Automobile();
            car.drive();
        }
    }
}
