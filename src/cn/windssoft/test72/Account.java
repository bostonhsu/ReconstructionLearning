package cn.windssoft.test72;

/**
 * Created by Administrator on 2017/6/12.
 */
public class Account {
    private AccountType _type;

    double interestForAmount_days(double amount, int days) {
        return _interestRate * amount * days / 365;
    }
}
