package bloaters.long_method.ancillary_refactorings.introduce_parameter_object;

import java.util.Date;

public class Customer {
    public int amountInvoicedIn(Date start, Date end) {
        return 0;
    }

    public int amountReceivedIn(Date start, Date end) {
        return 0;
    }

    public int amountOverdueIn(Date start, Date end) {
        return 0;
    }
}
