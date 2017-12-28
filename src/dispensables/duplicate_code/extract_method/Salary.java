package dispensables.duplicate_code.extract_method;

public class Salary {
    private double amount;

    public double getGross() {
        return amount - getSocialTax();
    }

    public double getNet() {
        double incomeTax = amount * 0.13;
        return amount - getSocialTax() - incomeTax;
    }

    private double getSocialTax() {
        return amount * 0.75;
    }
}
