package cn.windssoft.sixth;

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
        printBanner();
        printDetails(amount);
    }

    private void printDetails(double amount) {
        System.out.println("name:" + _name);
        System.out.println("amount" + amount);
    }
}
