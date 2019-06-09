package designPattaren.builder;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-16 下午5:43
 **/
public class CarBuilderImpl implements CarBuilder {
    Wheel wheel = null;
    Engine engine = null;
    Seat seat = null;

    @Override
    public void getWheel() {
        this.wheel = new Wheel();
        System.out.println("this is wheel.");
    }

    @Override
    public void getEngine() {
        this.engine = new Engine();
        System.out.println("this is engine.");
    }

    @Override
    public void getSeat() {
        this.seat = new Seat();
        System.out.println("this is seat.");
    }
}
