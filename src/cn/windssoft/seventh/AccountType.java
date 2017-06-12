package cn.windssoft.seventh;

/**
 * Created by Administrator on 2017/6/12.
 */
public class AccountType {

    public boolean isPremium() {
        boolean result  = false;
        return result;
    }

    double overdraftCharge(int daysOverdrawn) {
        if (isPremium()) {
            double result = 10;
            if (daysOverdrawn > 7) result += (daysOverdrawn - 7) * 0.85;
            return result;
        } else {
            return daysOverdrawn * 1.75;
        }
    }
}
