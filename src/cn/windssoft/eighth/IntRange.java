package cn.windssoft.eighth;

/**
 * Created by Administrator on 2017/6/12.
 */
public class IntRange {
    public int getLow() {
        return _low;
    }

    public int getHigh() {
        return _high;
    }

    public void setLow(int low) {
        _low = low;
    }

    public void setHigh(int high) {
        _high = high;
    }

    private int _low, _high;

    boolean includes(int arg) {
        return arg >= getLow() && arg <= getHigh();
    }

    void grow(int factor) {
        setHigh(getHigh() * factor);
    }

    IntRange(int low, int high) {
        initialize(low, high);
    }

    private void initialize(int low, int high) {
        _low = low;
        _high = high;
    }
}
