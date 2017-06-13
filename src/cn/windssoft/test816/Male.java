package cn.windssoft.test816;

/**
 * Created by Administrator on 2017/6/13.
 */
class Male extends Person {
    @Override
    boolean isMale() {
        return true;
    }

    @Override
    char getCode() {
        return 'M';
    }
}
