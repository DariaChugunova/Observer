public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private int price;
    private int amount;
    private Subject Information;

    public CurrentConditionsDisplay(Subject Information) {
        this.Information = Information;
        Information.registerObserver(this);
    }
    public void update(int price, int amount) {
        this.price = price;
        this.amount = amount;
        display();
    }
    public void display() {
        System.out.println("Цена = " + price
                + " оставшееся кол-во = " + amount);
    }
}
