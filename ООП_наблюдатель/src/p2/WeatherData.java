package p2;


import java.util.*;

public class WeatherData implements Subject {
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>();//контейнер для хранения наблюдателей
    }

    public void registerObserver(Observer o) {
        observers.add(o);//новые наблюдатели добавляются в конец списка
    }

    public void removeObserver(Observer o) {
        observers.remove(o);//если наблюдатель хочут уйти, удаляем его
    }

    public void notifyObservers() {//оповещение наблюдателя об изменении
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {//оповещение оновых данных
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}