package bloaters.long_method.replace_method_with_method_object;

class Order {
    public double primaryBasePrice;
    public double secondaryBasePrice;
    public double tertiaryBasePrice;

    //...
    public double price() {
        return new PriceCalculator(this).compute();
    }
}

class PriceCalculator {
    private double primaryBasePrice;
    private double secondaryBasePrice;
    private double tertiaryBasePrice;

    public PriceCalculator(Order order) {
        primaryBasePrice = order.primaryBasePrice;
        secondaryBasePrice = order.secondaryBasePrice;
        tertiaryBasePrice = order.tertiaryBasePrice;
    }

    public double compute() {
        // long computation.
        //...
        return 0;
    }
}
