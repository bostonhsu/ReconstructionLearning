package cn.windssoft.test750;

import java.util.Date;

/**
 * Created by Administrator on 2017/6/12.
 */
public class MfDateSub extends Date {
    public MfDateSub() {
        super();
    }

    public MfDateSub(Date arg) {
        super(arg.getYear(), arg.getMonth(), arg.getDay() + 1);
    }

    public MfDateSub(int year, int month, int day) {
        super(year, month, day);
    }

    public MfDateSub nextDay(Date arg) {
        MfDateSub result = new MfDateSub(arg.getYear(), arg.getMonth(), arg.getDay() + 1);
        return  result;
    }


}
