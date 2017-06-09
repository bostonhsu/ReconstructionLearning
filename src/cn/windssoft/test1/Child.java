package cn.windssoft.test1;

/**
 * Created by Administrator on 2017/6/9.
 */
public class Child {
    private final MyFather father = new MyFather();

    public Child() {}
    public Child(String name) {
        father.name = name;
    }

    public Father getFather() {
        return father;
    }

    public String getName() {
        return father.getName();
    }

    public void setName(String name) {
        father.setName(name);
    }

    public String toString() {
        return father.toString();
    }

    private class MyFather extends Father {
        public String toString() {
            return this.getClass().getName() + " " + name;
        }
    }
}
