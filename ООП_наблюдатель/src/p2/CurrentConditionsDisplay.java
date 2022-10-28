package p2;
//Отображение текущих условий
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;//влажность
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {//конструктор передает объект, который регистрирует наблюдателя
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
    public void display() {
        System.out.println("Текущие условия:" + temperature
                + " градусов " + humidity + "% влажности");
    }
}
