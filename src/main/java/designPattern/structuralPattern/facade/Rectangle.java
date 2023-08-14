package designPattern.structuralPattern.facade;

/**
 * @author yangnk
 * @desc
 * @date 2023/08/14 21:05
 **/
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("this is rangle");
    }
}