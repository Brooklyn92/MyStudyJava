package udemy.lesson22_encapsulationAnd_nasledovanie.hw22;

public class Student {
    private StringBuilder name;
    private int course;
    private int grade;

    public StringBuilder getName() {
        return name;
    }

    public void setName(StringBuilder name) {
        int maxLength = 3;
        if (name.length() > maxLength) {
            this.name = new StringBuilder(name.substring(0, maxLength));
        }
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course<=4) {
            this.course = course;
        }
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade<=10){
            this.grade = grade;
        }
    }
    public void showInfo() {

        System.out.println((getName()));
        System.out.println(getCourse());
        System.out.println(getGrade());
    }

}

class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName(new StringBuilder("Ivan"));//Iva
        student1.setCourse(4);
        student1.setGrade(4);
        student1.showInfo();
    }

}
