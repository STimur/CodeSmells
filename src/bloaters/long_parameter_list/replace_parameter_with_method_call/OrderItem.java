package bloaters.long_parameter_list.replace_parameter_with_method_call;

public class OrderItem {
    private int quantity;
    private int itemPrice;

    public double getPrice() {
        int basePrice = quantity * itemPrice;
        double seasonDiscount = this.getSeasonalDiscount();
        double fees = this.getFees();
        return discountedPrice(basePrice, seasonDiscount, fees);
    }

    private double discountedPrice(int basePrice, double seasonDiscount, double fees) {
        return basePrice * seasonDiscount * (1 + fees);
    }

    private double getFees() {
        return 0.2;
    }

    private double getSeasonalDiscount() {
        return 0.5;
    }
}
