package designPattern.creationalPattern.builder.v3;

/**
 * @author yangnk
 * @desc
 * @date 2023/08/13 20:49
 **/
public class Test {
    public static void main(String[] args) {
        //mac
        ComputerBuilder builder = new MacComputerBuilder("2", "8");
        ComputerDirector director = new ComputerDirector();
        director.makeComputer(builder);

        //lenove
        ComputerBuilder builder1 = new LenovoComputerBuilder("4", "16");
        ComputerDirector director1 = new ComputerDirector();
        director1.makeComputer(builder1);

        Computer computer = builder.getComputer();
        System.out.println("computer = " + computer);

        Computer computer1 = builder1.getComputer();
        System.out.println("computer1 = " + computer1);

    }
}