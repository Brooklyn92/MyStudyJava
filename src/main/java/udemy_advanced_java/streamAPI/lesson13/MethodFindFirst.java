package udemy_advanced_java.streamAPI.lesson13;

import udemy_advanced_java.streamAPI.lesson2.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MethodFindFirst {
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

        Student first = students.stream().map(el ->
        {
            el.setName(el.getName().toUpperCase(Locale.ROOT));
            return el;
        }).filter(el -> el.getSex()=='f')
                .sorted((x,y) -> x.getAge() - y.getAge())
                .findFirst().get();

        System.out.println(first); // => Student{name='ELENA', sex=f, age=19, course=1, avgGrade=8.9}
    }
}
