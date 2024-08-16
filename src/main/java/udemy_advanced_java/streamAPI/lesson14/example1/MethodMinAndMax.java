package udemy_advanced_java.streamAPI.lesson14.example1;

import udemy_advanced_java.streamAPI.lesson2.Student;
import java.util.ArrayList;
import java.util.List;

public class MethodMinAndMax {
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

        Student minAge = students.stream().min((x,y) -> x.getAge() - y.getAge()).get();
        System.out.println(minAge); // => Student{name='Elena', sex=f, age=19, course=1, avgGrade=8.9}

        Student maxAge = students.stream().max((x,y) -> x.getAge() - y.getAge()).get();
        System.out.println(maxAge); // => Student{name='Petr', sex=m, age=35, course=4, avgGrade=7.0}
    }
}
