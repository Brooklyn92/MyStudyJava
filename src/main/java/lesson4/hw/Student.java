package lesson4.hw;

public class Student {
    int numberStudentTicked;
    String firstName;
    String lastName;
    int yearStudy;
    double eco;
    double math;
    double en;

    public Student(int numberStudentTicked, String firstName, String lastName, int yearStudy, double eco, double math, double en) {
        this.numberStudentTicked = numberStudentTicked;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearStudy = yearStudy;
        this.eco = eco;
        this.math = math;
        this.en = en;
    }
}
