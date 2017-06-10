package cn.windssoft.sixth;

/**
 * Created by Administrator on 2017/6/10.
 */
public class Second {
    double _height;
    double _width;

    private void test() {
        final double perimeter = 2 * (_height + _width);
        System.out.println(perimeter);
        final double area = _height * _width;
        System.out.println(area);
    }
}
