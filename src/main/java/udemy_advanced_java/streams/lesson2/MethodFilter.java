package udemy_advanced_java.streams.lesson2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MethodFilter {
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

        students = students.stream().filter(el -> el.getAge()>22 && el.getAvgGrade()<7.2).collect(Collectors.toList());
        System.out.println(students); // => [Student{name='Nikolay', sex=m, age=28, course=2, avgGrade=6.4}, Student{name='Petr', sex=m, age=35, course=4, avgGrade=7.0}]


//====================Отсылка к lennon5=======================================================================
//        students = students.stream().sorted((x,y) ->
//                x.getName().compareTo(y.getName())
//        ).collect(Collectors.toList());
//        System.out.println(students); // => список сортируется по именам по алфавитному порядку, с помощью метода sorted и интерфейса Comparator внутри него

    }
}
