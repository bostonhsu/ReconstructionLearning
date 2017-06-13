package test870;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 2017/6/13.
 */
public class Order {
    Set<Customer> getCustomers() {
        return _customers;
    }

    void addCustomer(Customer arg) {
        arg.friendOrders().add(this);
        _customers.add(arg);
    }

    void removeCustomer(Customer arg) {
        arg.friendOrders().remove(this);
        _customers.remove(arg);
    }

    Set<Customer> _customers = new HashSet<Customer>();

}
