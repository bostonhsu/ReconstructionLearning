package cn.windssoft.test816;

/**
 * Created by Administrator on 2017/6/13.
 */
public abstract class Person {
    boolean isMale() {
        return _isMale;
    }

    abstract char getCode();

    private final boolean _isMale;
    private final char _code;

    protected Person(boolean isMale, char code) {
        _isMale = isMale;
        _code = code;
    }

    static Person createMale() {
        return new Male();
    }

    static Person createFemale() {
        return new Female();
    }
}
