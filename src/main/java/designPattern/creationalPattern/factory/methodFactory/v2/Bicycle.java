package designPattern.creationalPattern.factory.methodFactory.v2;

/**
 * @author yangnk
 * @desc
 * @date 2023/08/13 18:05
 **/
public class Bicycle implements Car{
    @Override
    public void drive() {
        System.out.println("bicycle is runing...");
    }
}