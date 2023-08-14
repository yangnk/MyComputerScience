package designPattern.structuralPattern.adapter.v2;

/**
 * @author yangnk
 * @desc
 * @date 2023/08/14 09:59
 **/
public class Adapter implements Target{
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void chargeBy220v() {
        adaptee.chargeBy110V();
        System.out.println("再加上110v");
    }
}