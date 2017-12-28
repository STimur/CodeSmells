package dispensables.duplicate_code.extract_method;

public class Salary {
    private double amount;

    public double getGross() {
        double socialTax = amount * 0.75;
        return amount - socialTax;
    }

    public double getNet() {
        double socialTax = amount * 0.75;
        double incomeTax = amount * 0.13;
        return amount - socialTax - incomeTax;
    }
}
