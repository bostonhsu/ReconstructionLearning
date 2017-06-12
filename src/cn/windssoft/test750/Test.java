package cn.windssoft.test750;

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
        manager = john.getManager();
        System.out.println(manager);
    }

    public static void main(String[] args) {
        test();
    }
}
