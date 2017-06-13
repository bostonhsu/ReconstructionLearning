package cn.windssoft.test8110;

import junit.framework.Assert;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Administrator on 2017/6/13.
 */
public class Person {
    private Set _courses = new HashSet();

    public Set getCourses() {
        return _courses;
    }

    public void addCourse(Course arg) {
        _courses.add(arg);
    }

    public void removeCourse(Course arg) {
        _courses.remove(arg);
    }

    public void initializeCourses(Set arg) {
        Assert.assertTrue(_courses.isEmpty());
        Iterator iterator = arg.iterator();
        while (iterator.hasNext()) {
            addCourse((Course)iterator.next());
        }
    }

}
