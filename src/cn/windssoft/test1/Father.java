package cn.windssoft.test1;

/**
 * Created by Administrator on 2017/6/9.
 */
public class Father {
    String name;

    public Father() {}
    public Father(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return this.getClass().getName();
    }
}
