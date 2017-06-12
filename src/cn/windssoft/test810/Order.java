package cn.windssoft.test810;

/**
 * Created by Administrator on 2017/6/12.
 */
public class Order {
    private String _customer;

    public Order(String customer) {
        _customer = customer;
    }

    public String getCustomer() {
        return _customer;
    }

    public void setCustomer(String arg) {
        _customer = arg;
    }
}
