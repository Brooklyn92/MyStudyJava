package udemy.lesson30_lambda;

import java.util.ArrayList;

public class ExampleNoLambda {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student student1 = new Student("Ivan", "male", 22, 3, 8.3);
        Student student2 = new Student("Nikolay", "male", 28, 2, 6.4);
        Student student3 = new Student("Elena", "female", 19, 1, 8.9);
        Student student4 = new Student("Petr", "male", 35, 4, 7);
        Student student5 = new Student("Mariya", "female", 23, 3, 9.1);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        StudentInfo studentInfo = new StudentInfo();
//        studentInfo.printStudentOverAVG(list, 8.5);
//        studentInfo.printStudentUnderAVG(list, 9);
//        studentInfo.printStudentOverAge(list, 25);
//        studentInfo.printStudentUnderAge(list, 27);
//        studentInfo.printStudentByGender(list,"male");
        studentInfo.printStudentMixCondition(list,7.2, 23, "female");
    }

}

class Student {
    String name;
    String gender;
    int age;
    int course;
    double avg;

    public Student(String name, String gender, int age, int course, double avg) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.course = course;
        this.avg = avg;
    }
}

class StudentInfo {
    void printStudent(Student st) {
        System.out.println("Имя студента: " + st.name + ", gender: " + st.gender + ", age: " + st.age + ", course: " + st.course + ", avg: "  + st.avg);
    }
    void printStudentOverAVG(ArrayList<Student> students, double avgGrade) {
        for (Student s:students) {
            if (s.avg > avgGrade) {
                printStudent(s);
            }
        }
    }

    void printStudentUnderAVG(ArrayList<Student> students, double avgGrade) {
        for (Student s:students) {
            if (s.avg < avgGrade) {
                printStudent(s);
            }
        }
    }

    void printStudentOverAge(ArrayList<Student> students, int age) {
        for (Student s:students) {
            if (s.age > age) {
                printStudent(s);
            }
        }
    }

    void printStudentUnderAge(ArrayList<Student> students, int age) {
        for (Student s:students) {
            if (s.age < age) {
                printStudent(s);
            }
        }
    }

    void printStudentByGender(ArrayList<Student> students, String gender) {
        for (Student s:students) {
            if (s.gender == gender) {
                printStudent(s);
            }
        }
    }

    void printStudentMixCondition(ArrayList<Student> students, double avgGrade, int age, String gender) {
        for (Student s:students) {
            if (s.avg > avgGrade &&  s.age < age && s.gender == gender) {
                printStudent(s);
            }
        }
    }
}
