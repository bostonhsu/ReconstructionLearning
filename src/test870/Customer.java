package test870;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 2017/6/13.
 */
public class Customer {
    private Set _orders = new HashSet();

    Set friendOrders() {
        /** should only be used by Order when modifying the association */
        return _orders;
    }

    void addOrder(Order arg) {
        arg.setCustomer(this);
    }

}
