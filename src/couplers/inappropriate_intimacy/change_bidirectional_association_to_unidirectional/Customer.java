package couplers.inappropriate_intimacy.change_bidirectional_association_to_unidirectional;

import java.util.List;

public class Customer {
    private List<Order> orders;

    public void printOrders() {
        for (Order order : orders)
            System.out.println(order);
    }
}
