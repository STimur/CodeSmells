package bloaters.primitive_obsession.replace_data_value_with_object;

public class Order {
    private String customerId;
    private String customerName;
    private String customerPhone;

    public String getCustomerSummery() {
        return customerId + " " + customerName + " " + customerPhone;
    }
}
