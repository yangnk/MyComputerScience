package designPattern.behavioralPattern.observer;

import java.util.Observable;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2019-06-09 上午10:03
 **/
public class WeatherDisplay extends MyObserver {
    private float temprature;

    public WeatherDisplay(Subject subject) {
        subject.registerObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        this.temprature = (float) arg;
        display();
    }

    private void display() {
        System.out.println("dispaly temprature:" + temprature);
    }
}
