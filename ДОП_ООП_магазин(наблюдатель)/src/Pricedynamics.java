public class Pricedynamics implements Observer, DisplayElement {
    int lastprice;
    int currentprice = 500;
    int lastamount;
    int currentamount = 5;
    private Information information;

    public Pricedynamics(Information information) {
        this.information = information;
        information.registerObserver(this);
    }

    public void update(int price, int amount) {
        lastprice= currentprice;
        currentprice = price;

        lastamount = currentamount;
        currentamount = amount;

        display();
    }

    public void display() {
        System.out.println("Статистика изменений");

        if (currentprice > lastprice) {
            System.out.println("Цена повысилась");
        } else if (currentprice == lastprice) {
            System.out.println("Цена прежняя");
        } else if (currentprice < lastprice) {
            System.out.println("Цена понизилась");
        }

        if (currentamount > lastamount) {
            System.out.println("Пришли новые товары, кол-во увеличилось");
        } else if (currentamount == lastamount) {
            System.out.println("Кол-во прежнее");
        } else if (currentamount < lastamount) {
            System.out.println("Кто-то совершил покупку, кол-во товара уменьшилось");
        }

    }
}
