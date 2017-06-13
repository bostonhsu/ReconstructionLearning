package cn.windssoft.test815;

/**
 * Created by Administrator on 2017/6/13.
 */
public class Employee {
    private int _type;
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;
    private int _monthSalary;
    private int _commission;
    private int _bonus;

    Employee(int type) {
        setType(type);
}

    int getType() {
        return _type;
    }

    void setType(int arg) {
        _type = arg;
    }

    int payAmount() {
        switch (getType()) {
            case ENGINEER:
                return _monthSalary;
            case SALESMAN:
                return _monthSalary + _commission;
            case MANAGER:
                return _monthSalary + _bonus;
            default:
                throw new RuntimeException("Incorrect Employee");
        }
    }
}
