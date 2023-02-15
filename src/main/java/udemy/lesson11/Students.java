package udemy.lesson11;

public class Students {
    String name;
    int course;
    double grade;

    public Students(String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public static void swap(Students s1, Students s2) {
        Students s3 = s1;
        s1 = s2;
        s2 = s3;
        System.out.println(s1.name);
        System.out.println(s2.name);
    }
    public static void changeName(Students s1) {
        s1.name = "Vasiliy";

    }

    public static void main(String[] args) {
        Students st1 = new Students("Ivan", 3, 6.3);
        Students st2 = new Students("Petr", 1, 7.3);
        swap(st1,st2); // в методе swap существет метод вывода имени, тем самым отобразится замена имём местами
        //System.out.println(st1.name); // изменение имён местами не произойдёт
        //System.out.println(st2.name); // изменение имён местами не произойдёт
        changeName(st2);
        System.out.println(st2.name);// имя Petr поменяется на Vasiliy
        /* Когда в параметрах метода указан референс тип данных, используется вместо параметра его копия, с помощью копий
        мы можем изменять элементы, но не можем менять сам объект.
         */
    }
}
