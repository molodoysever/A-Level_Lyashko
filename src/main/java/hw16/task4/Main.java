package hw16.task4;

import java.util.LinkedList;
import java.util.List;

import static hw16.task4.StudListUtil.delStudents;
import static hw16.task4.StudListUtil.printStudents;

public class Main {
    final protected static List<Student> studentList = new LinkedList<>();

    public static void main(String[] args) {

        studentList.add(new Student("Aa", "1-A", 1, 1));
        studentList.add(new Student("Bb", "2-B", 2, 2));
        studentList.add(new Student("Cc", "3-C", 3, 3));
        studentList.add(new Student("Dd", "4-D", 4, 4));
        studentList.add(new Student("Ee", "5-E", 5, 5));
        studentList.add(new Student("Ff", "6-F", 6, 1));
        studentList.add(new Student("Gg", "1-G", 1, 2));
        studentList.add(new Student("Hh", "2-H", 2, 3));
        studentList.add(new Student("Ii", "3-I", 3, 4));

        System.out.println(studentList);
        printStudents(studentList, 3);
        System.out.println(delStudents());
    }
}
