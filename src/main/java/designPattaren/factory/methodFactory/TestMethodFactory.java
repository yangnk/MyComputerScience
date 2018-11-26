package designPattaren.factory.methodFactory;

/**
 * Created by yangnk23900 on 2018/11/26.
 */
public class TestMethodFactory {
	public static void main(String[] args) {
		CarFactory carFactory = new AutomobileFactory();
		carFactory.run();
		CarFactory carFactory1 = new BicycleFactory();
		carFactory1.run();
		Automobile automobile = (Automobile) carFactory.newInstance();
		if (automobile instanceof Automobile) {
			System.out.println("Assemble  automobile successful.");
		}
	}
}
