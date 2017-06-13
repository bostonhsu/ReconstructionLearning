package cn.windssoft.test8110;

import junit.framework.Assert;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 2017/6/13.
 */
public class Test {
    public void test() {
        Person kent = new Person();
        Set s = new HashSet();
        kent.addCourse(new Course("Smalltalk Programming", false));
        kent.addCourse(new Course("Appreciating Single Malts", true));
        Assert.assertEquals(2, kent.getCourses().size());
        Course refact = new Course("Refacting", true);
        kent.addCourse(refact);
        kent.addCourse(new Course("Brutel Sarcasm", false));
        Assert.assertEquals(4, kent.getCourses().size());
        kent.getCourses().remove(refact);
        Assert.assertEquals(3, kent.getCourses().size());

        kent.numberOfAdvancedCourses();
        kent.numberOfCourses();

    }

}
