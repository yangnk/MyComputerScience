package designPattaren.builder.Prototype;

public class Square extends Shape {
    public Square() {
        name = "Square";
    }

    public void draw() {
        System.out.println("call Square draw().");
    }
}