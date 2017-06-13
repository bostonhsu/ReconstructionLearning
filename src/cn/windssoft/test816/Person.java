package cn.windssoft.test816;

/**
 * Created by Administrator on 2017/6/13.
 */
public abstract class Person {
    abstract boolean isMale();
    abstract char getCode();

    static Person createMale() {
        return new Male();
    }

    static Person createFemale() {
        return new Female();
    }
}
