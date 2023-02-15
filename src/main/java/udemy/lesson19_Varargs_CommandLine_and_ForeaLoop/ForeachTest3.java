package udemy.lesson19_Varargs_CommandLine_and_ForeaLoop;

public class ForeachTest3 {
    public static void main(String[] args) {
        String[] students = {"Ivanov", "Sidorov", "Petrov"};
        String[] exams = {"mat", "analiz", "filosofia"};
        for (String s1:students){
            for (String s2: exams){
                System.out.println(s1+ " " + s2);
            }
        }
    }
}
