package main.chainOfResponsibility;

import java.util.Objects;

public class USATaxCalculator extends TaxCalculator {
    @Override
    public double getValue(double total, String countryName) throws CountryNotFoundException {

        {
            if (countryName.equalsIgnoreCase("USA")) {
                double c = 0.85 * total;
                System.out.println("Amount after American govt taxes=" + c);
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
