package main.chainOfResponsibility;

import java.util.Objects;

public class RussiaTaxCalculator extends TaxCalculator {
    @Override
    public double getValue(double total, String countryName) throws CountryNotFoundException {

        {
            if (countryName.equalsIgnoreCase("Russia")) {
                double c = 0.8 * total;
                System.out.println("Amount after Russian govt taxes=" + c);
                return c;
            } else {
                if (Objects.nonNull(next))
                    next.getValue(total, countryName);
                else
                    throw new CountryNotFoundException("Country not registered");
            }
        }
        return 0.0;

    }
}
