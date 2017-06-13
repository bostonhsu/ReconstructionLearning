package cn.windssoft.test816;

/**
 * Created by Administrator on 2017/6/13.
 */
public class Female extends Person {
    protected Female() {
        super(false, 'F');
    }

    @Override
    char getCode() {
        return 'F';
    }
}
