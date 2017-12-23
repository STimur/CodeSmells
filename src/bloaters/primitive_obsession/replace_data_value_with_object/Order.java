package bloaters.primitive_obsession.replace_data_value_with_object;

public class Order {
    int id;
    Customer customer;

    public String getOrderSummary() {
        return "Order " + id + " " + customer.getCustomerSummery();
    }
}
