package cn.windssoft.test810;

/**
 * Created by Administrator on 2017/6/12.
 */
public class Customer {
    private final String _name;

    public Customer(String name) {
        _name = name;
    }

    public String getName() {
        return _name;
    }

    public static Customer create(String name) {
        return new Customer(name);
    }

}
