package designPattaren.observer;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2019-06-09 上午10:17
 **/
public class Main {
    public static void main(String[] args) {
        Weather weather = new Weather();
        WeatherDisplay weatherDisplay = new WeatherDisplay(weather);

        weather.setTemperature(27);
        weather.notifyObserver();
    }
}
