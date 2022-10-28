public class PriceStatistics implements Observer, DisplayElement  {
    private int max = 0;
    private int min = Integer.MAX_VALUE;
    private int sum = 0;
    private int k = 0;
    private Information information;

    public PriceStatistics(Information information){
        this.information = information;
        information.registerObserver(this);
    }
    public void update(int price,int amount) {
        sum += price;
        k++;

        if (price > max) {
            max = price;
        }

        if (price < min) {
            min = price;
        }

        display();
    }

    public void display() {
        System.out.println("Диапозон цены");
        System.out.println("Средняя/Максимальная/Минимальная температура = " + (sum / k)
                + "/" + max + "/" + min);
    }
}
