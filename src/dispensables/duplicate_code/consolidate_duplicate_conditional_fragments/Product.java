package dispensables.duplicate_code.consolidate_duplicate_conditional_fragments;

public class Product {
    private double total;
    private double price;

    void market() {
        if (isSpecialDeal())
            total = price * 0.95;
        else
            total = price * 0.98;
        send();
    }

    private void send() {
    }

    private boolean isSpecialDeal() {
        return false;
    }
}
