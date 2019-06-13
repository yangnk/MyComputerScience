package test;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2019-06-12 下午9:05
 **/
public class Main {
    public static void main(String[] args) {
        IDriver iDriver = new DriverImpl();
        ICar iCar = new BMW();
        iCar.setName("BMW");
        iDriver.driver(iCar);
    }
}
