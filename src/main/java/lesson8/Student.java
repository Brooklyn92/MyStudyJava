package lesson8;

public class Student {
    String name;
    int course;
    static int count; // переменная пренадлежит классу, а не объекту, поэтому эта переменная общая для всех

    public Student(String name, int course) {
        count++;
        this.name = name;
        this.course = course;
        System.out.println("Student " + count + " create");
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 1);
        Student st2 = new Student("Petr", 4);
        Student st3 = new Student("Masha", 2);
        System.out.println(Student.count);// что бы вызвать статическую переменную, её нужно вызвать через имя класса,
                                          // в котором находится данная переменная


    }
}
