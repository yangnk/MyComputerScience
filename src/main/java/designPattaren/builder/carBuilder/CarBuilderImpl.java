package designPattaren.builder.carBuilder;

import com.sun.xml.internal.ws.api.pipe.Engine;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-16 下午5:43
 **/
public class CarBuilderImpl implements CarBuilder {
    Wheel wheel = null;
    Engine1 engine = null;
    Seat seat = null;

    @Override
    public void getWheel() {
        this.wheel = new Wheel();
        System.out.println("this is wheel.");
    }

    @Override
    public void getEngine() {
        this.engine = new Engine1();
        System.out.println("this is engine.");
    }

    @Override
    public void getSeat() {
        this.seat = new Seat();
        System.out.println("this is seat.");
    }
}
