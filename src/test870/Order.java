package test870;

import java.util.Set;

/**
 * Created by Administrator on 2017/6/13.
 */
public class Order {

    private Customer _customer;

    Customer getCustomers() {
        return _customer;
    }

    void setCustomer(Customer arg) {
        if (_customer != null) {
            _customer.friendOrders().remove(this);
        }
        _customer = arg;
        if (_customer != null) {
            _customer.friendOrders().add(this);
        }
    }

    double getDiscountPrice(Customer customer) {
        return getGrossPrice() * (1 - customer.getDiscount());
    }

    private double getGrossPrice() {
        return 0.0;
    }

}
