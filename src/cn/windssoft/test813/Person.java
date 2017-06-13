package cn.windssoft.test813;

/**
 * Created by Administrator on 2017/6/13.
 */
public class Person {
    public static final int O = BloodGroup.O.getCode();
    public static final int A = BloodGroup.A.getCode();
    public static final int B = BloodGroup.B.getCode();
    public static final int AB = BloodGroup.AB.getCode();

    private BloodGroup _bloodGroup;

    public Person(int bloodGroup) {
        _bloodGroup = BloodGroup.code(bloodGroup);
    }

    public Person(BloodGroup bloodGroup) {
        _bloodGroup = bloodGroup;
    }

    public void setBloodGroup(BloodGroup arg) {
        _bloodGroup = arg;
    }

    public void setBloodGroup(int arg) {
        _bloodGroup = BloodGroup.code(arg);
    }

    public int getBloodGroupCode() {
        return _bloodGroup.getCode();
    }

    public BloodGroup getBloodGroup() {
        return _bloodGroup;
    }
}
