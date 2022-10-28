public class cashbox {
    public static void main(String[] args) {
        Information information = new Information();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(information);
        Pricedynamics pricedynamics = new Pricedynamics(information);
        PriceStatistics priceStatistics = new PriceStatistics(information);

        information.setMeasurements(3000,60);
        System.out.println();
        information.setMeasurements(2000,15);
        System.out.println();
        information.setMeasurements(2600,35);
        System.out.println();
        information.setMeasurements(1500,8);
        System.out.println();
    }
}
