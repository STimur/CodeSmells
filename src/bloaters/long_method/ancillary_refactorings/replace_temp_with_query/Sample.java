package bloaters.long_method.ancillary_refactorings.replace_temp_with_query;

public class Sample {
    private double quantity;
    private double itemPrice;

    double calculateTotal() {
        if (getBasePrice() > 1000) {
            return getBasePrice() * 0.95;
        }
        else {
            return getBasePrice() * 0.98;
        }
    }

    private double getBasePrice() {
        return quantity * itemPrice;
    }
}
