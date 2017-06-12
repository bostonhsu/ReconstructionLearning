package cn.windssoft.test750;

import java.text.DateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2017/6/12.
 */
public class MfDateSub extends Date {
    public MfDateSub(String dateString) {
        super(Date.parse(dateString));
    }

    public MfDateSub(Date arg) {
        super(arg.getTime());
    }

    Date nextDay() {
        return new Date(getYear(), getMonth(), getDay() + 1);
    }
}
