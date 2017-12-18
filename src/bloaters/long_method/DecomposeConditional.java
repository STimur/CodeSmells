package bloaters.long_method;

import java.util.Date;

public class DecomposeConditional {
    private static final Date SUMMER_START = new Date(118, 5, 1);
    private static final Date SUMMER_END = new Date(118, 7, 31);
    private int quantity;
    private double winterRate;
    private double winterServiceCharge;
    private double charge;
    private double summerRate;

    public void calcCharge(Date date) {
        if (notSummer(date)) {
            charge = calcWinterCharge();
        }
        else {
            charge = calcSummerCharge();
        }
    }

    private double calcSummerCharge() {
        return quantity * summerRate;
    }

    private double calcWinterCharge() {
        return quantity * winterRate + winterServiceCharge;
    }

    private boolean notSummer(Date date) {
        return date.before(SUMMER_START) || date.after(SUMMER_END);
    }
}
