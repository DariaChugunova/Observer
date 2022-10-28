package p1;

public class WeatherData {
    float Temperature ;
    float Humidity ;

    public WeatherData(float temperature, float humidity, float pressure) {
        Temperature = temperature;
        Humidity = humidity;
        Pressure = pressure;
    }

    float Pressure ;

    public float getTemperature() {
        return Temperature;
    }

    public void setTemperature(float temperature) {
        Temperature = temperature;
    }

    public float getHumidity() {
        return Humidity;
    }

    public void setHumidity(float humidity) {
        Humidity = humidity;
    }

    public float getPressure() {
        return Pressure;
    }

    public void setPressure(float pressure) {
        Pressure = pressure;
    }

    // Объявления переменных экземпляров
    public void measurementsChanged() {//метод вызывается при каждом бновлении показаний
        float temp = getTemperature();//получаем новейшие изменения
        float humidity = getHumidity();
        float pressure = getPressure();
        new currentConditionsDisplay().update(temp, humidity, pressure);//обновляется каждый экран
        new statisticsDisplay().update(temp, humidity, pressure);
        //мы не можем добавлять и удалять визуальные эдементы без внесения изменений в прогрумму
        //набор экранов жестко фиксируется
    }

}



