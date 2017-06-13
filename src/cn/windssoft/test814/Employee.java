package cn.windssoft.test814;

/**
 * Created by Administrator on 2017/6/13.
 */
public class Employee {
    private int _type;
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    private Employee(int type) {
        _type = type;
    }

    int getType() {
        return _type;
    }

    static Employee create(int type) {
        if (type == ENGINEER) {
            return new Engineer();
        } else {
            return new Employee(type);
        }
    }
}
