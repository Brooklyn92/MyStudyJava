package lesson30_lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class ExampleWithLambda3 {
    public static void main(String[] args) {
        ArrayList<Student4> list = new ArrayList<>();
        Student4 student1 = new Student4("Ivan", "male", 22, 3, 8.3);
        Student4 student2 = new Student4("Nikolay", "male", 28, 2, 6.4);
        Student4 student3 = new Student4("Elena", "female", 19, 1, 8.9);
        Student4 student4 = new Student4("Petr", "male", 35, 4, 7);
        Student4 student5 = new Student4("Mariya", "female", 23, 3, 9.1);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        StudentInfo4 studentInfo4 = new StudentInfo4();
        studentInfo4.testStudents(list, (Student4 st) -> {return st.avg > 8.5;}); // => первый вид лямбды-выражения
        System.out.println("============================================================================================");
        studentInfo4.testStudents(list,  st ->  st.avg < 9); // => второй вид лямбды-выражения(Более распространённый)
        System.out.println("============================================================================================");
        studentInfo4.testStudents(list, (Student4 st) -> {return st.age > 25;});
        System.out.println("============================================================================================");
        studentInfo4.testStudents(list, (Student4 st) -> {return st.age < 27;});
        System.out.println("============================================================================================");
        studentInfo4.testStudents(list, (Student4 st) -> {return st.gender=="male";});
        System.out.println("============================================================================================");
        studentInfo4.testStudents(list, (Student4 st) -> {return st.avg > 7.2 && st.age < 23 && st.gender == "female";});
    }
}
    class Student4 {
        String name;
        String gender;
        int age;
        int course;
        double avg;

        public Student4(String name, String gender, int age, int course, double avg) {
            this.name = name;
            this.gender = gender;
            this.age = age;
            this.course = course;
            this.avg = avg;
        }
    }


    class StudentInfo4 {
        //метод вывода информаии о студенте
        void printStudent(Student4 st) {
            System.out.println("Имя студента: " + st.name + ", gender: " + st.gender + ", age: " + st.age + ", course: " + st.course + ", avg: " + st.avg);
        }

        // создание метода с интерфейсом Predicate, он является системным
        void testStudents(ArrayList<Student4> students4, Predicate<Student4> t) {
            for (Student4 s : students4) {
                if (t.test(s)) {
                    printStudent(s);
                }
            }
        }
    }
