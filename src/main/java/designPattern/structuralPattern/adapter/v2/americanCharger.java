package designPattern.structuralPattern.adapter.v2;

/**
 * @author yangnk
 * @desc
 * @date 2023/08/14 09:59
 **/
public class americanCharger implements Adaptee{
    @Override
    public void chargeBy110V() {
        System.out.println("美国供电器，只为你服务，正在通过110V电压为您充电");
    }
}