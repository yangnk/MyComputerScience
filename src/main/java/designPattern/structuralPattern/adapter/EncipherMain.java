package designPattern.structuralPattern.adapter;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-17 下午12:24
 **/
public class EncipherMain {
    public static void main(String[] args) {
        EncipherAdatper encipherAdatper = new EncipherAdatper("个人信息...");
        String s = encipherAdatper.enCode();
        System.out.println(s);
    }
}
