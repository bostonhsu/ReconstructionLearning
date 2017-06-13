package cn.windssoft.test8110;

import junit.framework.Assert;

import java.util.*;

/**
 * Created by Administrator on 2017/6/13.
 */
public class Person {
    private Set _courses = new HashSet();

    public Set getCourses() {
        return Collections.unmodifiableSet(_courses);
    }

    public void addCourse(Course arg) {
        _courses.add(arg);
    }

    public void removeCourse(Course arg) {
        _courses.remove(arg);
    }

    public void initializeCourses(Set arg) {
        Assert.assertTrue(_courses.isEmpty());
        _courses.addAll(arg);
    }

    int numberOfAdvancedCourses() {
        Iterator iterator = getCourses().iterator();
        int count = 0;
        while (iterator.hasNext()) {
            Course each = (Course)iterator.next();
            if (each.isAdvanced()) {
                count ++;
            }
        }
        return count;
    }
}
