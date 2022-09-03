package main.chainOfResponsibility;

public class MainTaxCalculator {
    public static void main(String[] args) {
        IndiaTaxCalculator indiaTaxCalculator = new IndiaTaxCalculator();
        USATaxCalculator usaTaxCalculator = new USATaxCalculator();
        RussiaTaxCalculator russiaTaxCalculator = new RussiaTaxCalculator();

        indiaTaxCalculator.setTaxCalculator(usaTaxCalculator);
        usaTaxCalculator.setTaxCalculator(russiaTaxCalculator);

        try {
            indiaTaxCalculator.getValue(100, "India");
            indiaTaxCalculator.getValue(100, "USA");
            indiaTaxCalculator.getValue(100, "Russia");
            indiaTaxCalculator.getValue(100, "China");
        } catch (CountryNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}
