package udemy_base_java.lesson13_switch;

public class Test1 {
}

class Student {
    int grade;

    public Student(int grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student st1 = new Student(5);
        /* ======Классический вид констркуии if
        if (st1.grade == 2){
            System.out.println("Студент двоечникт");
        }
        else if (st1.grade == 3){
            System.out.println("Студент троечник");
        }
        else if (st1.grade == 4){
            System.out.println("Студент ударник");
        }
        else if (st1.grade == 5){
            System.out.println("Студент отличник");
        }
        else {
            System.out.println("Оценка не верна");
        }
         */
        // Классический вид констркуии switch
        switch (st1.grade)  {
            case 2:
                System.out.println("Студент двоечник");
                break;
            case 3:
                System.out.println("Студент троечник");
                break;
            case 4:
                System.out.println("Студент ударник");
                break;
            case 5:
                System.out.println("Студент отличник");
                break;
            default:
                System.out.println("Оценка не верна");
        }
    }
}
