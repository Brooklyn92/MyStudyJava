package udemy_advanced_java.streamAPI.lesson17;

import udemy_advanced_java.streamAPI.lesson2.Student;
import java.util.ArrayList;
import java.util.List;

public class MethodMapToInt {
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

//        List<Integer> courses = students.stream()
//                .mapToInt(el -> el.getCourse())
//                .boxed()
//                .collect(Collectors.toList());
//        // Метод boxed() приобразует int в Integer
//
//        System.out.println(courses); // => [3, 2, 1, 4, 3]

        int sum  = students.stream().mapToInt(el -> el.getCourse()).sum();
        System.out.println(sum); // => 13

        double average  = students.stream().mapToInt(el -> el.getCourse()).average().getAsDouble();
        System.out.println(average); // => 2.6

        int min  = students.stream().mapToInt(el -> el.getCourse()).min().getAsInt();
        System.out.println(min); // => 1

        int max  = students.stream().mapToInt(el -> el.getCourse()).max().getAsInt();
        System.out.println(max); // => 4
    }
}
