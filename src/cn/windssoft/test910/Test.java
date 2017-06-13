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
        for (int i = 0; i < people.length; i++) {
            if (people[i].equals("Don")) {
                sendAlert();
                break;
            }
            if (people[i].equals("John")) {
                sendAlert();
                break;
            }
        }
    }

    private void sendAlert() {
    }
}
