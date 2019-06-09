package designPattaren.observer;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2019-06-09 上午9:57
 **/
public class Weather implements Subject{
    private ArrayList<MyObserver> observerArrayList = new ArrayList<>();

    private float temperature;

    @Override
    public void registerObserver(MyObserver observer) {
        this.observerArrayList.add(observer);
    }

    @Override
    public void removeObserver(MyObserver observer) {
        this.observerArrayList.remove(observer);

    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < this.observerArrayList.size(); i++) {
            this.observerArrayList.get(i).update(new Observable(), temperature);
        }
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public void weatherChange() {
        this.notifyObserver();
    }
}
