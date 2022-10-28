import java.util.*;
public class Information implements Subject{
    private List<Observer> observers;
    private int price;//цена
    private int amount;//кол-во

    public Information() {
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
            observer.update(price, amount);
        }
    }

    public void measurementsChanged() {//оповещение оновых данных
        notifyObservers();
    }

    public void setMeasurements(int price, int amount) {
        this.price = price;
        this.amount = amount;
        measurementsChanged();
    }
}
