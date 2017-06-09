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
    private String platform;
    private String browser;
    private int resize;

    final boolean isMacOs = platform.toUpperCase().contains("MAC");
    final boolean isIEBrowser = browser.toUpperCase().contains("IE");
    final boolean wasResized = resize > 0;

    double price() {
        final int basePrice = _quantity * _itemPrice;
        return basePrice - Math.max(0, _quantity - 500) * _itemPrice * 0.05 +
                Math.min(_quantity * _itemPrice * 0.1, 100.0);
    }

    double getPrice() {
        return basePrice() * discountFactor();
    }

    private void f65() {
        if (isMacOs && isIEBrowser && wasInitialized() && wasResized) {
            // do something
        }
    }

    private boolean wasInitialized() {
        boolean result = false;
        return result;
    }

    private double discountFactor() {
        if (basePrice() > 1000) {
            return 0.95;
        } else {
            return 0.98;
        }
    }

    private int basePrice() {
        return _quantity * _itemPrice;
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
