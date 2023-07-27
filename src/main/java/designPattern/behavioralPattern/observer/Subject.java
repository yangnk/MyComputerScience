package designPattern.behavioralPattern.observer;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2019-06-09 上午9:50
 **/
public interface Subject {
    public void registerObserver(MyObserver observer);

    public void removeObserver(MyObserver observer);

    public void notifyObserver();
}
