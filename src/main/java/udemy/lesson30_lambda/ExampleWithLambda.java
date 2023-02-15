package udemy.lesson30_lambda;

import java.util.ArrayList;

public class ExampleWithLambda {
    public static void main(String[] args) {
        ArrayList<Student3> list = new ArrayList<>();
        Student3 student1 = new Student3("Ivan", "male", 22, 3, 8.3);
        Student3 student2 = new Student3("Nikolay", "male", 28, 2, 6.4);
        Student3 student3 = new Student3("Elena", "female", 19, 1, 8.9);
        Student3 student4 = new Student3("Petr", "male", 35, 4, 7);
        Student3 student5 = new Student3("Mariya", "female", 23, 3, 9.1);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        StudentInfo3 studentInfo3 = new StudentInfo3();
        studentInfo3.testStudents(list, (Student3 st) -> {return st.avg > 8.5;}); // => первый вид лямбды-выражения
        System.out.println("============================================================================================");
        studentInfo3.testStudents(list,  st ->  st.avg < 9); // => второй вид лямбды-выражения(Более распространённый)
        System.out.println("============================================================================================");
        studentInfo3.testStudents(list, (Student3 st) -> {return st.age > 25;});
        System.out.println("============================================================================================");
        studentInfo3.testStudents(list, (Student3 st) -> {return st.age < 27;});
        System.out.println("============================================================================================");
        studentInfo3.testStudents(list, (Student3 st) -> {return st.gender=="male";});
        System.out.println("============================================================================================");
        studentInfo3.testStudents(list, (Student3 st) -> {return st.avg > 7.2 && st.age < 23 && st.gender == "female";});
    }
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