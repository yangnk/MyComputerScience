package designPattern.creationalPattern.factory.methodFactory.v2;

/**
 * @author yangnk
 * @desc
 * @date 2023/08/13 18:08
 **/
public class AutomobileFactory implements CarFactory{
    Automobile automobile;
    @Override
    public Car getCar() {
        automobile = new Automobile();
        return automobile;
    }
}