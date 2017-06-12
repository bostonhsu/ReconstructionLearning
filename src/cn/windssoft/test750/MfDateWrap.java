package cn.windssoft.test750;

import java.util.Date;

/**
 * Created by Administrator on 2017/6/12.
 */
public class MfDateWrap {
    private Date _original;

    public MfDateWrap(String dateString) {
        _original = new Date(dateString);
    }

    public MfDateWrap(Date arg) {
        _original = arg;
    }

    public int getYear() {
            return _original.getYear();
    }

    public int getMonth() {
        return _original.getMonth();
    }

    public int getDay() {
        return _original.getDay();
    }

    public boolean equals(Object arg) {
        if (this == arg) {
            return true;
        }
        if (!(arg instanceof MfDateWrap)) {
            return false;
        }
        MfDateWrap other = ((MfDateWrap) arg);
        return (_original.equals(other._original));
    }

    Date nextDay() {
        return new Date(getYear(), getMonth(), getDay() + 1);
    }
}
