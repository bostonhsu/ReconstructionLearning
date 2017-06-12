package cn.windssoft.eighth;

/**
 * Created by Administrator on 2017/6/12.
 */
public class CappedRange extends IntRange {
    private int _cap;

    CappedRange(int low, int high) {
        super(low, high);
    }

    int getCap() {
        return _cap;
    }

    int getHigh() {
        return Math.min(super.getHigh(), getCap());
    }
}
