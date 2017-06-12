package cn.windssoft.test730;

/**
 * Created by Administrator on 2017/6/12.
 */
public class TelephoneNumber {
    private String _areaCode;
    private String _number;

    String getAreaCode() {
        return _areaCode;
    }

    void setAreaCode(String arg) {
        _areaCode = arg;
    }

    void setNumber(String arg) {
        _number = arg;
    }

    String getNumber() {
        return _number;
    }

    public String getTelephoneNumber() {
        return ("(" + getAreaCode() + ") " + getNumber());
    }
}
