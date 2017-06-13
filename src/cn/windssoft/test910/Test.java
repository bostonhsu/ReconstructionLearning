package cn.windssoft.test910;

import java.util.Date;

/**
 * Created by Administrator on 2017/6/13.
 */
public class Test {
    private static final Date SUMMER_START = new Date("1 Apr 1998");
    private static final Date SUMMER_END = new Date("1 Apr 1998");

    private Date date;
    private double _winterServiceCharge;
    private double _winterRate;
    private double _summerRate;
    private int _seniority;
    private int _monthsDisabled;
    private boolean _isPartTime;
    private boolean _isDead;
    private boolean _isSeperate;
    private boolean _isRetired;

    double getPayAmount() {
        double result;
        if (_isDead) result = deadAmount();
        else {
            if (_isSeperate) result = seperateAmount();
            else {
                if (_isRetired) result = retireAmount();
                else result = normalPayAmount();
            };
        }
        return result;
    }

    private double normalPayAmount() {
        return 0;
    }

    private double retireAmount() {
        return 0;
    }

    private double seperateAmount() {
        return 0;
    }

    private double deadAmount() {
        return 0;
    }

    public void test() {
        double charge = 0;
        double quantity = 0;
        if (notSummer(date))
            charge = winterCharge(quantity);
        else
            charge = summerCharge(quantity);
    }

    private double summerCharge(double quantity) {
        return quantity * _summerRate;
    }

    private double winterCharge(double quantity) {
        return quantity * _winterRate + _winterServiceCharge;
    }

    private boolean notSummer(Date date) {
        return date.before(SUMMER_START) || date.after(SUMMER_END);
    }

    public int test2() {
        if (isNotEligibleForDisability()) return 0;
        // other compute code below
        // ...
        return 0;
    }

    private boolean isNotEligibleForDisability() {
        return (_seniority < 2) || (_monthsDisabled > 12) || (_isPartTime);
    }

    public double test3() {
        return (onVacation() && lengthOfService() > 10) ? 1 : 0.5;
    }

    private int lengthOfService() {
        return 0;
    }

    private boolean onVacation() {
        return false;
    }

    public void checkSecurity(String[] people) {
        String found = foundMiscreant(people);
        someLaterCode(found);
    }

    private String foundMiscreant(String[] people) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].equals("Don")) {
                sendAlert();
                return "Don";
            }
            if (people[i].equals("John")) {
                sendAlert();
                return "John";
            }
        }
        return "";
    }

    private void someLaterCode(String found) {

    }

    private void sendAlert() {
    }


}
