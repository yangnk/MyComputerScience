package designPattern.structuralPattern.adapter.v2;

/**
 * @author yangnk
 * @desc
 * @date 2023/08/14 10:01
 **/
public class AdapterTest {
    public static void main(String[] args) {
        Adaptee adaptee = new americanCharger();
        Adapter adapter = new Adapter(adaptee);
        adapter.chargeBy220v();
    }
}