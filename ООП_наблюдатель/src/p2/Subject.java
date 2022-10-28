package p2;

public interface Subject {
    public void registerObserver(Observer o);//на вход получает регистрируемый или удаляемый объект
    public void removeObserver(Observer o);
    public void notifyObservers();//оповещение наблюдателей об изменении состояния
}
