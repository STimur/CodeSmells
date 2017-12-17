package bloaters.long_method.ancillary_refactorings;

public class ReplaceTempWithQuery {
    private double quantity;
    private double itemPrice;

    double calculateTotal() {
        double basePrice = quantity * itemPrice;
        if (basePrice > 1000) {
            return basePrice * 0.95;
        }
        else {
            return basePrice * 0.98;
        }
    }
}
