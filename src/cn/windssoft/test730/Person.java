package cn.windssoft.test730;

/**
 * Created by Administrator on 2017/6/12.
 */
public class Person {
    private String _name;
    private String _officeAreaCode;
    private String _officeNumber;
    private TelephoneNumber _officeTelephone = new TelephoneNumber();
    
    public String getName() {
        return _name;
    }

    public String getTelephoneNumber() {
        return ("(" + _officeAreaCode + ") " + _officeNumber);
    }

    String getOfficeAreaCode() {
        return _officeAreaCode;
    }

    void setOfficeAreaCode(String arg) {
        _officeAreaCode = arg;
    }

    String getOfficeNumber() {
        return _officeNumber;
    }

    void setOfficeNumber(String arg) {
        _officeNumber = arg;
    }
}
