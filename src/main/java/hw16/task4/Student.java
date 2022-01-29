package hw16.task4;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString

public class Student {
    private final String name;
    private final String group;
    private int course;
    private final int mark;

    public Student(String name, String group, int course, int mark) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.mark = mark;
    }

    public void addCourse(int course) {
        this.course += course;
    }
}

