package cn.windssoft.test970;

/**
 * Created by Administrator on 2017/6/13.
 */
public class NullCustomer extends Customer {
    public boolean isNull() {
        return true;
    }

    public String getName() {
        return "occupant";
    }
}
