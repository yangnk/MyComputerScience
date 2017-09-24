package designPattaren.Builder.Prototype;

public class Rectangle extends Shape {
    public Rectangle() {
        name = "Rectangle";
    }

    public void draw() {
        System.out.println("call Rectangle draw().");
    }
}
