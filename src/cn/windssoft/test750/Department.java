package cn.windssoft.test750;

/**
 * Created by Administrator on 2017/6/12.
 */
public class Department {
    private String _chargeCode;
    private Person _manager;

    public Department(Person manager) {
        _manager = manager;
    }

    public Person getManager() {
        return _manager;
    }

}
