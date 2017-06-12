package cn.windssoft.test740;

/**
 * Created by Administrator on 2017/6/12.
 */
public class Person {
    private String _name;
    private String _areaCode;
    private String _number;

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

    public String getName() {
        return _name;
    }

    public String getTelephoneNumber() {
        return ("(" + getAreaCode() + ") " + getNumber());
    }

}
