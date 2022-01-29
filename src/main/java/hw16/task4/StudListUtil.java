package hw16.task4;

import java.util.List;
import static hw16.task4.Main.studentList;

public class StudListUtil {

    public static List<Student> delStudents() {
        studentList.removeIf(student -> student.getMark() < 3);
        studentList.removeIf(student -> student.getCourse() > 6);
        studentList.forEach(student -> student.addCourse(1));
        return studentList;
    }

    public static void printStudents(List<Student> students, int course) {
        students.stream().
                filter(student -> student.getCourse() == course).
                forEach(System.out::println);
    }
}
