package cn.windssoft.sixth;

/**
 * Created by Administrator on 2017/6/10.
 */
public class Account {
    int gamma(int inputVal, int quantity, int yearToDate) {
        return new Gamma(this, inputVal, quantity, yearToDate).compute();
    }

    int delta() {
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

    int compute() {
        int importantValue1 = (inputValue * quantity) + _account.delta();
        int importantValue2 = (inputValue * yearToDate) + 100;
        importantThing();
        int importantValue3 = importantValue2 * 7;
        return importantValue3 - 2 * importantValue1;
    }

    void importantThing() {
        if ((yearToDate - importantValue1) > 100) {
            importantValue2 -= 20;
        }
    }
}