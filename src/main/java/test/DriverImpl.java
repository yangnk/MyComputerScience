package test;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2019-06-12 下午9:06
 **/
public class DriverImpl implements IDriver{
    @Override
    public void driver(ICar iCar) {
        System.out.println("driver:" + iCar.getName());
        iCar.run();
    }
}
