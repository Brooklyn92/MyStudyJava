package udemy_advanced_java.streams.lesson11;

import udemy_advanced_java.streams.lesson2.Student;
import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String name;
    private List<Student> studentsOnFaculty;

    public Faculty(String name) {
        this.name = name;
        this.studentsOnFaculty = new ArrayList<>();
    }

    public List<Student> getStudentsOnFaculty() {
        return studentsOnFaculty;
    }

    public void addStudentToFaculty(Student student) {
        studentsOnFaculty.add(student);
    }
}
