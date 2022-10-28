package p2;

public class ForecastDisplay implements Observer, DisplayElement {//Отображение прогноза
    private float currentPressure = 29.92f;//текущее давление
    private float lastPressure;//последнее давление
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;

        display();
    }

    public void display() {
        System.out.print("Прогноз: ");
        if (currentPressure > lastPressure) {
            System.out.println("Погода улучшается");
        } else if (currentPressure == lastPressure) {
            System.out.println("Все также");
        } else if (currentPressure < lastPressure) {
            System.out.println("Погода ухудшается, утепляйтесь!");
        }
    }
}