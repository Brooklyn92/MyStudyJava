package udemy_advanced_java.collection.hashmap.lesson2;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashMapExample2 {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student st1 = new Student("Заур", "Трегулов", 3);
        Student st2 = new Student("Мария", "Захарова", 1);
        Student st3 = new Student("Сергей", "Петров", 4);
        map.put(st1, 7.5);
        map.put(st2, 8.7);
        map.put(st3, 9.2);
        System.out.println(map);

        Student st4 = new Student("Сергей", "Петров", 4);
        boolean result = map.containsKey(st4);
        System.out.println("result: " + result); // => result: false - без переопределения метода hashCode и result: true - с переопределённым методом hashCode.
        Student st5 = new Student("Петр", "Сидоров", 4);
        for (Map.Entry<Student, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue()); // => Student{name='Заур', surname='Трегулов', course=3} : 7.5; Student{name='Сергей', surname='Петров', course=4} : 9.2;  Student{name='Мария', surname='Захарова', course=1} : 8.7
        }

    }
}
class Student {
    String name;
    String surname;
    int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,surname,course);
    }
}
