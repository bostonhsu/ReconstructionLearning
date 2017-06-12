package cn.windssoft.test810;

/**
 * Created by Administrator on 2017/6/12.
 */
public class Order {
    private Customer _customer;

    public Order(String customer) {
        _customer = new Customer(customer);
    }

    public String getCustomer() {
        return _customer.getName();
    }

    public void setCustomer(String arg) {
        _customer = new Customer(arg);
    }
}
