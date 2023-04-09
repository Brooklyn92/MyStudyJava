package udemy_advanced_java.streams.lesson11;

import udemy_advanced_java.streams.lesson2.Student;

import java.util.ArrayList;
import java.util.List;

public class MethodFlatMap {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan", 'm',22,3,8.3);
        Student student2 = new Student("Nikolay", 'm',28,2,6.4);
        Student student3 = new Student("Elena", 'f',19,1,8.9);
        Student student4 = new Student("Petr", 'm',35,4,7);
        Student student5 = new Student("Mariya", 'f',23,3,7.4);

        Faculty f1 = new Faculty("Economic");
        Faculty f2 = new Faculty("Applied mathematics");

        f1.addStudentToFaculty(student1);
        f1.addStudentToFaculty(student2);
        f1.addStudentToFaculty(student3);
        f2.addStudentToFaculty(student4);
        f2.addStudentToFaculty(student5);

        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(f1);
        facultyList.add(f2);

        facultyList.stream().flatMap(faculty -> faculty.getStudentsOnFaculty().stream()).forEach(e -> System.out.println(e.getName())); // => Ivan, Nikolay, Elena, Petr, Mariya

    }
}
