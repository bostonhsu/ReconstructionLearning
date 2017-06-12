package cn.windssoft.test740;

/**
 * Created by Administrator on 2017/6/12.
 */
public class TelephoneNumber {

    private String _number;
    private String _areaCode;

    String getAreaCode() {
        return _areaCode;
    }

    void setAreaCode(String arg) {
        _areaCode = arg;
    }

    String getNumber() {
        return _number;
    }

    void setNumber(String arg) {
        _number = arg;
    }

    public String getTelephoneNumber() {
        return ("(" + getAreaCode() + ") " + getNumber());
    }
}
