package cn.windssoft.test810;

/**
 * Created by Administrator on 2017/6/12.
 */
public class Order {
    private Customer _customer;

    public Order(String customerName) {
        _customer = new Customer(customerName);
    }

    public String getCustomerName() {
        return _customer.getName();
    }

    public void setCustomer(String customerName) {
        _customer = new Customer(customerName);
    }
}
