package cn.windssoft.test810;

import java.util.Dictionary;
import java.util.Hashtable;

/**
 * Created by Administrator on 2017/6/12.
 */
public class Customer {
    private final String _name;

    private static Dictionary _instances = new Hashtable();

    private Customer(String name) {
        _name = name;
    }

    public String getName() {
        return _name;
    }

    public static Customer create(String name) {
        return new Customer(name);
    }

    static void loadCustomers() {
        new Customer("Lemon Car Hire").store();
        new Customer("Associated Coffee Machines").store();
        new Customer("Bilston Gasworks").store();
    }

    private void store() {
        _instances.put(this.getName(), this);
    }

}
