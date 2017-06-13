package cn.windssoft.test970;

/**
 * Created by Administrator on 2017/6/13.
 */
public class Customer implements Nullable {
    private String _name;
    private BillingPlan _plan;
    private PaymentHistory _history;

    public String getName() {
        return _name;
    }

    public BillingPlan getPlan() {
        return _plan;
    }

    public PaymentHistory getHistory() {
        return _history;
    }

    public boolean isNull() {
        return false;
    }

    protected Customer() {

    }
}

