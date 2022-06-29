package designPattaren.builder;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-16 下午5:47
 **/
public class Director {
    CarBuilder carBuilder = null;

    void construct() {
        this.carBuilder = new CarBuilderImpl();
        carBuilder.getEngine();
        carBuilder.getWheel();
        carBuilder.getSeat();
    }
}
