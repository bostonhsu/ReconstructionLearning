package test870;

/**
 * Created by Administrator on 2017/6/13.
 */
public class Order {
    Customer getCustomer() {
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

    Customer _customer;
    
}
