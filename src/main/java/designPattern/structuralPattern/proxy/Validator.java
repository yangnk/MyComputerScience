package designPattern.structuralPattern.proxy;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-17 下午5:57
 **/
public class Validator {
    public Boolean validate(String s) {
        if (s == "yangyang") {
            System.out.println("login...");
            return true;
        } else {
            return false;
        }
    }
}
