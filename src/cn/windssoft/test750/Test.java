package cn.windssoft.test750;

import java.util.Date;

/**
 * Created by Administrator on 2017/6/12.
 */
public class Test {
    public static void test() {
        Person john = new Person();
        Person boston = new Person();
        Department sale = new Department(boston);
        john.setDepartment(sale);
        Person manager;
        manager = john.getDepartment().getManager();
        System.out.println(manager);
    }

    public static void main(String[] args) {
        test();
    }

    public static void test1() {
        Date previousEnd = new Date();
        Date newStart = new Date(previousEnd.getYear(), previousEnd.getMonth(), previousEnd.getDay() + 1);
    }
}
