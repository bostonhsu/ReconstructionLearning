package cn.windssoft.sixth;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by Administrator on 2017/6/9.
 */
public class First {
    String _name;
    Order anOrder;
    private Vector _orders = new Vector();
    private int _numberOfLateDeliveries;
    private int _quantity;
    private int _itemPrice;

    double getPrice() {
        final int basePrice = _quantity * _itemPrice;
        final double discountFactor;
        if (basePrice > 1000) {
            discountFactor = 0.95;
        } else {
            discountFactor = 0.98;
        }
        basePrice = 10;
        return basePrice * discountFactor;
    }

    public void printOwing() {
        printBanner();
        double outstanding = getOutstanding();
        printDetails(outstanding);
    }

    boolean test() {
        return (anOrder.basePrice() > 1000);
    }

    int getRating() {
        return (_numberOfLateDeliveries > 5) ? 2 : 1;
    }

    public void printOwingNew(double amount) {
        Enumeration e = _orders.elements();
        double outstanding = 0.0;

        System.out.println("*************************");
        System.out.println("****** Customer Owes*****");
        System.out.println("*************************");

        while (e.hasMoreElements()) {
            Order each = (Order)e.nextElement();
            outstanding += each.getAmount();
        }

        System.out.println("name:" + _name);
        System.out.println("amount" + amount);
    }

    public void printOwing(double previousAmount) {
        printBanner();
        double outstanding = getOutstandingNew(previousAmount * 1.2);
        printDetails(outstanding);
    }

    private double getOutstandingNew(double initial) {
        double result = initial;
        Enumeration e = _orders.elements();
        while (e.hasMoreElements()) {
            Order each = (Order)e.nextElement();
            result += each.getAmount();
        }
        return result;
    }

    private double getOutstanding() {
        Enumeration e = _orders.elements();
        double result = 0.0;
        while (e.hasMoreElements()) {
            Order each = (Order)e.nextElement();
            result += each.getAmount();
        }
        return result;
    }

    private void printDetails(double outstanding) {
        System.out.println("name:" + _name);
        System.out.println("amount" + outstanding);
    }

    private void printBanner() {
        System.out.println("*************************");
        System.out.println("****** Customer Owes*****");
        System.out.println("*************************");
    }


}
