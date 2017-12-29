package object_orientation_abusers.switch_statements.introduce_null_object;

public class Contract {
    private final BillingPlan billingPlan;

    public Contract(Customer customer) {
        if (customer == null) {
            billingPlan = BillingPlan.basic();
        } else {
            billingPlan = customer.getPlan();
        }
    }
}

class Customer {
    public BillingPlan getPlan() {
        return null;
    }
}

class BillingPlan {
    public static BillingPlan basic() {
        return null;
    }
}
