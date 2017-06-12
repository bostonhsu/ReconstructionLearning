package cn.windssoft.test750;

/**
 * Created by Administrator on 2017/6/12.
 */

public class Person {
    Department _department;

    public void setDepartment(Department arg) {
        _department = arg;
    }

    @Override
    public String toString() {
        return getDepartment() + this.getClass().getName().toString();
    }

    public Department getDepartment() {
        return _department;
    }
}
