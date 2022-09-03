package main.chainOfResponsibility;

public abstract class TaxCalculator {

    protected TaxCalculator next;

    public abstract double getValue(double total, String countryName) throws CountryNotFoundException;

    public void setTaxCalculator(TaxCalculator taxCalculator) {
        this.next = taxCalculator;
    }
}
