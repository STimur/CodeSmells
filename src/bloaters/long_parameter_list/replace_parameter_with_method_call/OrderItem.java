package bloaters.long_parameter_list.replace_parameter_with_method_call;

public class OrderItem {
    private final double FEES = 0.2;
    private final double SEASONAL_DISCOUNT = 0.5;
    private int quantity;
    private int itemPrice;

    public double discountedPrice() {
        return getBasePrice() * SEASONAL_DISCOUNT * (1 + FEES);
    }

    public int getBasePrice() {
        return quantity * itemPrice;
    }
}
