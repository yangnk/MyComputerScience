package designPattern.creationalPattern.builder.v3;

/**
 * @author yangnk
 * @desc
 * @date 2023/08/13 20:48
 **/
public abstract class ComputerBuilder {
    public abstract void setUsbCount();
    public abstract void setKeyboard();
    public abstract void setDisplay();

    public abstract Computer getComputer();
}