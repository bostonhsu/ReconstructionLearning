package cn.windssoft.test740;

/**
 * Created by Administrator on 2017/6/12.
 */
public class Person {
    private String _name;
    private TelephoneNumber _officeTelephone = new TelephoneNumber();

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
