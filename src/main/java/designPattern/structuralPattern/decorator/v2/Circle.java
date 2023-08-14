package designPattern.structuralPattern.decorator.v2;

/**
 * @author yangnk
 * @desc
 * @date 2023/08/14 20:08
 **/
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("this is circle");
    }
}