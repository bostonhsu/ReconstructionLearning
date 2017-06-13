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

    public void test() {
        double charge = 0;
        double quantity = 0;
        if (date.before(SUMMER_START) || date.after(SUMMER_END))
            charge = quantity * _winterRate + _winterServiceCharge;
        else
            charge = quantity * _summerRate;
    }
}
