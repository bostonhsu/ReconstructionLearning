package cn.windssoft.test8110;

/**
 * Created by Administrator on 2017/6/13.
 */
public class Course {
    private String _name;
    private boolean _isAdvanced;

    public Course(String name, boolean isAdvanced) {
        _name = name;
        _isAdvanced = isAdvanced;
    }

    public boolean isAdvanced() {
        return _isAdvanced;
    }
}
