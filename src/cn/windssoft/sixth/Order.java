package cn.windssoft.sixth;

/**
 * Created by Administrator on 2017/6/9.
 */
public class Order {
    double amount = 0.0;

    public Order() {}

    public Order(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public double basePrice() {
        return amount;
    }
}
