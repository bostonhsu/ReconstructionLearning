package cn.windssoft.test730;

/**
 * Created by Administrator on 2017/6/12.
 */
public class Person {
    private String _name;
    private TelephoneNumber _officeTelephone = new TelephoneNumber();

    public String getName() {
        return _name;
    }

    TelephoneNumber getOfficeTelephone() {
        return _officeTelephone;
    }

    public String getTelephoneNumber() {
        return _officeTelephone.getTelephoneNumber();
    }

}
