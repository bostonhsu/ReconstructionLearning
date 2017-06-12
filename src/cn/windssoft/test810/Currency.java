package cn.windssoft.test810;

/**
 * Created by Administrator on 2017/6/12.
 */
public class Currency {

    private String _code;

    private Currency(String code) {
        _code = code;
    }

    public String getCode() {
        return _code;
    }

    public boolean equals(Object arg) {
        if (!(arg instanceof Currency)) return false;
        Currency other = (Currency) arg;
        return (_code.equals(other._code));
    }

    public int hashCode() {
        return _code.hashCode();
    }
}

