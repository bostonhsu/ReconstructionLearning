package cn.windssoft.sixth;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by Administrator on 2017/6/9.
 */
public class First {
    String _name;
    private Vector _orders = new Vector();

    private void printBanner(){
        System.out.println("Banner");
    }

    public void printOwing(double amount) {
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

    private void printDetails(double amount) {
        System.out.println("name:" + _name);
        System.out.println("amount" + amount);
    }
}
