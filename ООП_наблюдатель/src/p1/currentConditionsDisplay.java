package p1;

public class currentConditionsDisplay{
   private float temperature;
    private float humidity;

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
    public  void display() {
        System.out.println("Текущие условия:" + temperature
                + " градусов " + humidity + "% влажности");
    }
}




