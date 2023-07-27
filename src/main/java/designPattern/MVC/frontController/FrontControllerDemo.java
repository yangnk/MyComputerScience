package designPattern.MVC.frontController;

public class FrontControllerDemo {
    public static void main(String[] args) {
        FrontController frontController1 = new FrontController();
        frontController1.dispatchRequest("homeview");
        frontController1.dispatchRequest("studentview");
    }
}
