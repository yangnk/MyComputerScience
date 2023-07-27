package designPattern.behavioralPattern.chainOfResponsibility;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-18 上午11:59
 **/
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
