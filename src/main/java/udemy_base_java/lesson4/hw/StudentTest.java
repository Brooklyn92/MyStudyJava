package udemy_base_java.lesson4.hw;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Alex", "Mum", 2019, 4.5, 4.9, 4.7);
        Student student2 = new Student(2, "Mark", "Li", 2019, 4.8, 4.1, 5.0);
        Student student3 = new Student(3, "Stiven", "Sigal", 2019, 4.4, 4.3, 4.6);

        System.out.println((student1.eco + student1.en + student1.math)/3);
        System.out.println((student2.eco + student2.en + student2.math)/3);
        System.out.println((student3.eco + student3.en + student3.math)/3);
    }
}
