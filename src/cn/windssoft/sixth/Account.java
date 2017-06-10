package cn.windssoft.sixth;

/**
 * Created by Administrator on 2017/6/10.
 */
public class Account {
    int gamma(int inputVal, int quantity, int yearToDate) {
        int importantValue1 = (inputVal * quantity) + delta();
        int importantValue2 = (inputVal * yearToDate) + 100;
        if ((yearToDate - importantValue1) > 100) {
            importantValue2 -= 20;
        }
        int importantValue3 = importantValue2 * 7;
        return importantValue3 - 2 * importantValue1;
    }

    private int delta() {
        return 0;
    }
}

class Gamma {
    private final Account _account;
    private int inputValue;
    private int quantity;
    private int yearToDate;
    private int importantValue1;
    private int importantValue2;
    private int importantValue3;

    public Gamma(Account account, int inputValue, int quantity, int yearToDate) {
        _account = account;
        this.inputValue = inputValue;
        this.quantity = quantity;
        this.yearToDate = yearToDate;
    }
}