package udemy_advanced_java.streams;

import udemy_advanced_java.streams.lesson2.Student;

import java.util.*;
import java.util.stream.Collectors;

public class ConvertingStreamToStringInOneElement {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan", 'm',22,3,8.3);
        Student student2 = new Student("Nikolay", 'm',28,2,6.4);
        Student student3 = new Student("Elena", 'f',19,1,8.9);
        Student student4 = new Student("Petr", 'm',35,4,7);
        Student student5 = new Student("Mariya", 'f',23,3,7.4);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

//        List<Student> strings = students.stream().filter(el -> el.getName() == "Ivan").collect(Collectors.toList());
//        String s = strings.stream().distinct().findFirst().get().getName();
//        System.out.println(s);

//        String name = students.stream()
//                .filter(s -> s.getName().equals("Ivan"))
//                .map(Student::getName)
//                .findFirst()
//                .orElse(null);
//        System.out.println(name);

//        String name = null;
//        if (students.stream().anyMatch(s -> s.getName().equals("Ivan"))) {
//            name = students.stream()
//                    .filter(s -> s.getName().equals("Ivan"))
//                    .map(Student::getName)
//                    .findFirst()
//                    .orElse(null);
//        }
//        System.out.println(name);

    }
}
