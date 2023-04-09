package udemy_advanced_java.streams.lesson15;

import udemy_advanced_java.streams.lesson2.Student;
import java.util.ArrayList;
import java.util.List;

public class MethodLimit {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student student2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student student3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student student4 = new Student("Petr", 'm', 35, 4, 7);
        Student student5 = new Student("Mariya", 'f', 23, 3, 7.4);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.stream().filter(e -> e.getAge() > 20).limit(2).forEach(System.out::println); // => Student{name='Ivan', sex=m, age=22, course=3, avgGrade=8.3} и Student{name='Nikolay', sex=m, age=28, course=2, avgGrade=6.4}
    }
}
