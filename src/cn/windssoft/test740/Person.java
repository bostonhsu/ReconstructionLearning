package cn.windssoft.test740;

/**
 * Created by Administrator on 2017/6/12.
 */
public class Person {
    private String _name;
    private TelephoneNumber _officeTelephone = new TelephoneNumber();

    String getAreaCode() {
        return _officeTelephone.getAreaCode();
    }

    void setAreaCode(String arg) {
        _officeTelephone.setAreaCode(arg);
    }

    String getNumber() {
        return _officeTelephone.getNumber();
    }

    void setNumber(String arg) {
        _officeTelephone.setNumber(arg);
    }

    public String getName() {
        return _name;
    }

    public String getTelephoneNumber() {
        return _officeTelephone.getTelephoneNumber();
    }

    TelephoneNumber getOfficeTelephone() {
        return _officeTelephone;
    }
}
