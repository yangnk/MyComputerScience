package designPattaren.chainOfResponsibility;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-18 上午11:59
 **/
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
