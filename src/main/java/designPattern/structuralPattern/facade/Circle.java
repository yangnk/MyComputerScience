package designPattern.structuralPattern.facade;

/**
 * @author yangnk
 * @desc
 * @date 2023/08/14 21:06
 **/
public class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("this is circle");
    }
}