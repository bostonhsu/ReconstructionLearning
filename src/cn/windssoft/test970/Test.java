package cn.windssoft.test970;

/**
 * Created by Administrator on 2017/6/13.
 */
public class Test {
    public void test() {
        Site site = new Site();
        Customer customer = site.getCustomer();
        BillingPlan plan;
        if (customer == null) plan = BillingPlan.basic();
        else plan = customer.getPlan();

        String customerName;
        if (customer == null) customerName = "occupant";
        else customerName = customer.getName();

        int weeksDeliquent;
        if (customer == null) weeksDeliquent = 0;
        else weeksDeliquent = customer.getHistory().getWeeksDelinquetInLastYear();
    }
}
