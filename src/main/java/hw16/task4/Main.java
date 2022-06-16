package hw16.task4;


import java.util.LinkedList;
import java.util.List;

import static hw16.task4.StudentUtil.deleteStudents;
import static hw16.task4.StudentUtil.printStudents;

public class Main {
    static List<Student> studentList = new LinkedList<> (  );

    public static void main ( String[] args ) {
        studentList.add(new Student("Aa", "1-A", 1, 1));
        studentList.add(new Student("Bb", "2-B", 2, 2));
        studentList.add(new Student("Cc", "3-C", 3, 3));
        studentList.add(new Student("Dd", "4-D", 4, 4));
        studentList.add(new Student("Ee", "5-E", 3, 5));
        studentList.add(new Student("Ff", "6-F", 6, 4));

        System.out.println(studentList);
        printStudents(studentList, 3);
        System.out.println(deleteStudents ());
    }
}
