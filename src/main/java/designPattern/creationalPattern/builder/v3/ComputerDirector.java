package designPattern.creationalPattern.builder.v3;

/**
 * @author yangnk
 * @desc
 * @date 2023/08/13 20:49
 **/
public class ComputerDirector {
    public void makeComputer(ComputerBuilder builder){
        builder.setUsbCount();
        builder.setDisplay();
        builder.setKeyboard();
    }
}