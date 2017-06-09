package cn.windssoft.test1;

/**
 * Created by Administrator on 2017/6/9.
 */
public class ChildTestDrive {
    public static void main(String[] args) {
        Father aChild = new Child("Aloha").getFather();
        System.out.println(aChild);
    }
}
