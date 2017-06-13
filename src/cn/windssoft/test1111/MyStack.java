package cn.windssoft.test1111;

import java.util.Vector;

/**
 * Created by Administrator on 2017/6/13.
 */
public class MyStack extends Vector {
    private Vector _vector = this;

    public void push(Object element) {
        insertElementAt(element, 0);
    }

    public Object pop() {
        Object result = firstElement();
        removeElementAt(0);
        return result;
    }
}
