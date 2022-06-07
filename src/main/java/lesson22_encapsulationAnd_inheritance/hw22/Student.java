package lesson22_encapsulationAnd_inheritance.hw22;

public class Student {
    private StringBuilder name = new StringBuilder();
    private int course;
    private int grade;

    public StringBuilder getName() {
        return name;
    }

    public void setName(StringBuilder name) {
            this.name = name;

    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course>4) {
            this.course = course;
        }
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade>10){
            this.grade = grade;
        }
    }

}
