package object_orientation_abusers.switch_statements.introduce_null_object;

public class Contract {
    private final BillingPlan billingPlan;

    public Contract(Customer customer) {
        billingPlan = customer.getPlan();
    }
}

class BillingPlan {
    public static BillingPlan basic() {
        return new BillingPlan();
    }
}

class Customer {
    private BillingPlan billingPlan;

    public BillingPlan getPlan() {
        return billingPlan;
    }

}

class NullCustomer extends Customer {
    @Override
    public BillingPlan getPlan() {
        return BillingPlan.basic();
    }

}

