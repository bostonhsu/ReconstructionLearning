package cn.windssoft.sixth;

import java.util.Date;

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

    public static void main(String[] args) {
        Date d3 = new Date("1 Apr 1998");
        System.out.println(d3);

        System.out.println(d3.getYear());
        System.out.println(d3.getMonth());
        System.out.println(d3.getDay());

        Date d1 = new Date("1 Apr 1998");
        System.out.println(d1);

        nextDateUpdate(d1);
        System.out.println(d1);

        Date d2 = new Date("1 Apr 1998");
        System.out.println(d2);

        nextDateReplace(d2);
        System.out.println(d2);
    }

    private static void nextDateReplace(Date arg) {
        arg = new Date(arg.getYear(), arg.getMonth(), arg.getDay());
        System.out.println("=>" + arg.toString());
    }

    private static void nextDateUpdate(final Date arg) {
        arg.setDate(arg.getDate() + 1);
        System.out.println("->" + arg.toString());
    }

    int discount(final int inputVal, final int quantity, final int yearToDate) {
        int result = inputVal;
        if (inputVal > 50) result -= 2;
        if (quantity > 100) result -= 1;
        if (yearToDate > 10000) result -= 4;
        return result;
    }

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
