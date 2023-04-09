package udemy_advanced_java.streams.lesson12.example2;

import udemy_advanced_java.streams.lesson2.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

public class MethodCollect2 {
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

        Map<Boolean, List<Student>> map =
                students.stream().collect(Collectors.partitioningBy(el -> el.getAvgGrade()>7));

        for (Map.Entry<Boolean, List<Student>> entry: map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }

    }
}
