package dispensables.duplicate_code.consolidate_conditional_expression;

public class Payment {
    private double amount;
    private int seniority;
    private int monthsDisabled;
    private boolean isPartTime;

    double disabilityAmount() {
        if (seniority < 2) {
            return 0;
        }
        if (monthsDisabled > 12) {
            return 0;
        }
        if (isPartTime) {
            return 0;
        }
        // compute the disability amount
        //...
        return Math.random() * amount;
    }
}
