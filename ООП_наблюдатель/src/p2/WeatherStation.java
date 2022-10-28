package p2;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);////Отображение текущих условий
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);////Отображение статистики
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);//Отображение прогноза
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);//Отображение теплового индекса

        weatherData.setMeasurements(80, 65, 30.4f);
        System.out.println();
        weatherData.setMeasurements(82, 70, 29.2f);
        System.out.println();
        weatherData.setMeasurements(78, 90, 29.2f);
        System.out.println();

        weatherData.removeObserver(forecastDisplay);
        weatherData.setMeasurements(62, 90, 28.1f);
    }
}

