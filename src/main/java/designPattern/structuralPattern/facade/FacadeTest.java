package designPattern.structuralPattern.facade;

/**
 * @author yangnk
 * @desc
 * @date 2023/08/14 21:07
 **/
public class FacadeTest {

    public static void main(String[] args) {

        ShapeFacade shapeFacade = new ShapeFacade();

        shapeFacade.drawCircle();
        shapeFacade.drawCircle();
        shapeFacade.drawSquare();

    }
}