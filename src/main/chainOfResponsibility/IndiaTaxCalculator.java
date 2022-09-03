
package main.chainOfResponsibility;

import main.observerPattern.ObserverNotFoundException;

import java.util.Objects;

public class IndiaTaxCalculator extends TaxCalculator {
    @Override
    public double getValue(double total, String countryName) throws CountryNotFoundException {


        if (countryName.equalsIgnoreCase("India")) {
            double c = 0.9 * total;
            System.out.println("Amount after Indian govt taxes=" + c);
            return c;
        } else {
            if (Objects.nonNull(next))
                next.getValue(total, countryName);
            else
                throw new CountryNotFoundException("Country not registered");
        }
        return 0.0;

    }
}
