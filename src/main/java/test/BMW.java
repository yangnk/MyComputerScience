package test;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2019-06-12 下午9:10
 **/
public class BMW implements ICar{
    private String name = "";

    @Override
    public void run() {
        System.out.println("BMW is running...");

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
