package p1;

public class main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(25,5,30);

       weatherData.measurementsChanged();

        WeatherData weatherData2 = new WeatherData(30,5,30);
        weatherData2.measurementsChanged();
    }
}
