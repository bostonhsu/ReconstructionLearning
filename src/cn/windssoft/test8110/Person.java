package cn.windssoft.test8110;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 2017/6/13.
 */
public class Person {
    private Set _courses = new HashSet();

    public Set getCourses() {
        return _courses;
    }

    public void setCourses(Set arg) {
        _courses = arg;
    }

    public void addCourse(Course arg) {
        _courses.add(arg);
    }

    public void removeCourse(Course arg) {
        _courses.remove(arg);
    }

}
