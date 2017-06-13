package cn.windssoft.test970;

/**
 * Created by Administrator on 2017/6/13.
 */
public class Test {
    public void test() {
        Site site = new Site();
        Customer customer = site.getCustomer();
        BillingPlan plan;
        if (customer.isNull()) plan = BillingPlan.basic();
        else plan = customer.getPlan();

        String customerName = customer.getName();

        int weeksDeliquent;
        if (customer.isNull()) weeksDeliquent = 0;
        else weeksDeliquent = customer.getHistory().getWeeksDelinquetInLastYear();

        if (! customer.isNull()) {
            customer.setPlan(BillingPlan.special());
        }
    }
}
