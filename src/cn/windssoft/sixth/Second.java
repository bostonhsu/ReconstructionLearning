package cn.windssoft.sixth;

/**
 * Created by Administrator on 2017/6/10.
 */
public class Second {
    double _height;
    double _width;
    private double _primaryForce;
    private double secondaryForce;
    private double _mass;
    private int _delay;

    private void test() {
        final double perimeter = 2 * (_height + _width);
        System.out.println(perimeter);
        final double area = _height * _width;
        System.out.println(area);
    }

    double getDistanceTravelled(int time) {
        double result;
        final double primaryAcc = _primaryForce / _mass;
        int primaryTime = Math.min(time, _delay);
        result = getAcc(primaryAcc, primaryTime);
        int secondaryTime = time - _delay;
        if (secondaryTime > 0) {
            double primaryVel = primaryAcc * _delay;
            final double secondaryAcc = (_primaryForce + secondaryForce) / _mass;
            result += primaryVel * secondaryTime + getAcc(secondaryAcc, secondaryTime);
        }
        return result;
    }

    private double getAcc(double acc, int time) {
        return 0.5 * acc * time * time;
    }
}
