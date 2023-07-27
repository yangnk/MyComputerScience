package designPattern.behavioralPattern.chainOfResponsibility;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-18 下午12:00
 **/
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
