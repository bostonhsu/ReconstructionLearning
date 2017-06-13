package cn.windssoft.test813;

/**
 * Created by Administrator on 2017/6/13.
 */
public class Person {
    private BloodGroup _bloodGroup;

    public Person(BloodGroup bloodGroup) {
        _bloodGroup = bloodGroup;
    }

    public void setBloodGroup(BloodGroup arg) {
        _bloodGroup = arg;
    }

    public BloodGroup getBloodGroup() {
        return _bloodGroup;
    }
}
