package cn.windssoft.test860;

import java.util.Observable;

/**
 * Created by BostonHsu on 2017/6/13.
 */
public class Interval extends Observable {
    private String _end = "0";

    String getEnd() {
        return  _end;
    }

    void setEnd(String arg) {
        _end = arg;
        setChanged();
        notifyObservers();
    }
}
