package designPattern.creationalPattern.builder.v2;

/**
 * @author yangnk
 * @desc
 * @date 2023/08/13 20:36
 **/
public class Test {

    public static void main(String[] args) {
        Computer computer = new Computer.Builder("2", "8")
                .setDisplay("LG")
                .setKeyboard("logic")
                .setUsbCount(1).build();

        System.out.println("computer = " + computer.toString());
    }
}