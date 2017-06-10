package cn.windssoft.sixth;

/**
 * Created by Administrator on 2017/6/10.
 */
public class Second {
    double _height;
    double _width;

    private void test() {
        double temp = 2 * (_height + _width);
        System.out.println(temp);
        temp = _height * _width;
        System.out.println(temp);
    }
}
