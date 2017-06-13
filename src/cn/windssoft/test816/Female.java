package cn.windssoft.test816;

/**
 * Created by Administrator on 2017/6/13.
 */
public class Female extends Person {
    @Override
    boolean isMale() {
        return false;
    }

    @Override
    char getCode() {
        return 'F';
    }
}
