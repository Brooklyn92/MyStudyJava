package lesson30_lambda;

import java.util.ArrayList;

public class Example2NoLambda {
    public static void main(String[] args) {
        ArrayList<Student2> list = new ArrayList<>();
        Student2 student1 = new Student2("Ivan", "male", 22, 3, 8.3);
        Student2 student2 = new Student2("Nikolay", "male", 28, 2, 6.4);
        Student2 student3 = new Student2("Elena", "female", 19, 1, 8.9);
        Student2 student4 = new Student2("Petr", "male", 35, 4, 7);
        Student2 student5 = new Student2("Mariya", "female", 23, 3, 9.1);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        StudentInfo2 studentInfo2 = new StudentInfo2();
        FindStudentsOverGrade findStudentsOverGrade = new FindStudentsOverGrade();
        studentInfo2.test(list, findStudentsOverGrade); // -> Имя студента: Elena, gender: female, age: 19, course: 1, avg: 8.9; Имя студента: Mariya, gender: female, age: 23, course: 3, avg: 9.1
    }
}

class Student2 {
    String name;
    String gender;
    int age;
    int course;
    double avg;

    public Student2(String name, String gender, int age, int course, double avg) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.course = course;
        this.avg = avg;
    }
}

class StudentInfo2 {
    void printStudent(Student2 st) {
        System.out.println("Имя студента: " + st.name + ", gender: " + st.gender + ", age: " + st.age + ", course: " + st.course + ", avg: "  + st.avg);
    }

    void test(ArrayList<Student2> students2, StudentChecks sc) {
        for (Student2 s:students2) {
            if (sc.test(s)) {
                printStudent(s);
            }
        }
    }
}

interface StudentChecks {
    boolean test(Student2 s);
}

class FindStudentsOverGrade implements StudentChecks {
    @Override
    public boolean test(Student2 s) {
        return s.avg > 8.5;
    }
}
