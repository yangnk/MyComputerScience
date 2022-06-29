package designPattaren.factory.simpleFactory;

/**
 * Created by yangnk23900 on 2018/11/26.
 */
public class TestSimpleFactory {
	public static void main(String[] args) {
		CarFactory carFactory = new CarFactory("Bicycle");
		CarFactory utomobile = new CarFactory("Automobile");
	}
}
