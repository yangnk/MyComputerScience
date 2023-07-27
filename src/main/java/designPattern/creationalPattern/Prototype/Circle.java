package designPattern.creationalPattern.Prototype;

public class Circle extends Shape {
    public Circle() {
        name = "Circle";
    }

    public void draw() {
        System.out.println("call Circle draw().");
    }
}
