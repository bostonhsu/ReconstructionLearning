package cn.windssoft.seventh;

/**
 * Created by Administrator on 2017/6/12.
 */
public class AccountType {

    public boolean isPremium() {
        boolean result  = false;
        return result;
    }

    double overdraftCharge(Account account) {
        if (isPremium()) {
            double result = 10;
            if (account.getDaysOverdrawn() > 7) result += (account.getDaysOverdrawn() - 7) * 0.85;
            return result;
        } else {
            return account.getDaysOverdrawn() * 1.75;
        }
    }
}
