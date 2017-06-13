package cn.windssoft.test815;

import java.lang.annotation.ElementType;

/**
 * Created by Administrator on 2017/6/13.
 */
public class Employee {
    private EmployeeType _type;

    private int _monthSalary;
    private int _commission;
    private int _bonus;

    Employee(int type) {
        setType(type);
}

    int getType() {
        return _type.getTypeCode();
    }

    void setType(int arg) {
        _type = EmployeeType.newType(arg);
    }

    int payAmount() {
        switch (getType()) {
            case EmployeeType.ENGINEER:
                return _monthSalary;
            case EmployeeType.SALESMAN:
                return _monthSalary + _commission;
            case EmployeeType.MANAGER:
                return _monthSalary + _bonus;
            default:
                throw new RuntimeException("Incorrect Employee");
        }
    }
}
