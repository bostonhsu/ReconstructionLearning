package cn.windssoft.test721;

/**
 * Created by Administrator on 2017/6/12.
 */
public class Account {
    private AccountType _type;

    double interestForAmount_days(double amount, int days) {
        return getInterestRate() * amount * days / 365;
    }

    public double getInterestRate() {
        return _type.get_interestRate();
    }

    public void setInterestRate(double _interestRate) {
        _type.set_interestRate(_interestRate);
    }
}
