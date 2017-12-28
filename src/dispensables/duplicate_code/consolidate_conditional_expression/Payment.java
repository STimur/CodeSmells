package dispensables.duplicate_code.consolidate_conditional_expression;

public class Payment {
    private double amount;
    private int seniority;
    private int monthsDisabled;
    private boolean isPartTime;

    double disabilityAmount() {
        if (isNotEligableForDisability())
            return 0;
        // compute the disability amount
        //...
        return Math.random() * amount;
    }

    private boolean isNotEligableForDisability() {
        return seniority < 2 || monthsDisabled > 12 || isPartTime;
    }
}
