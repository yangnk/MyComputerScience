package designPattern.structuralPattern.proxy;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-17 下午5:49
 **/
public class RealSearch implements Search {

    @Override
    public void search(String s) {
        if (s == "yangyang") {
            System.out.println("this is yangyang's detail: blabla...");
        }
    }
}
