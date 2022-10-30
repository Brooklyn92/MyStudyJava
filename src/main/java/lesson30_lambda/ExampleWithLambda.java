package lesson30_lambda;

import java.util.ArrayList;

public class ExampleWithLambda {
}

class Student3 {
    String name;
    String gender;
    int age;
    int course;
    double avg;

    public Student3(String name, String gender, int age, int course, double avg) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.course = course;
        this.avg = avg;
    }
}


class StudentInfo3 {
    void printStudent(Student3 st) {
        System.out.println("Имя студента: " + st.name + ", gender: " + st.gender + ", age: " + st.age + ", course: " + st.course + ", avg: "  + st.avg);
    }

    void testStudents(ArrayList<Student3> students3, StudentChecks2 sc) {
        for (Student3 s:students3) {
            if (sc.test(s)) {
                printStudent(s);
            }
        }
    }
}

interface StudentChecks2 {
    boolean test(Student3 s);
}