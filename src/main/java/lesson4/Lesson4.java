package lesson4;

public class Lesson4 {
        int id;
        String name;
        double balance;

    public Lesson4 (int id, String name, double balance) {
        this.balance=balance;
        this.id = id;
        this.name = name;
    }
}

class Lesson4Test {
    public static void main(String[] args) {
        Lesson4 lesson4 = new Lesson4(1,"Alex",12.12);
        System.out.println(lesson4);
        System.out.println("Client info: " + lesson4.id + " " + lesson4.name + " " + lesson4.balance);
        Lesson4 lesson2 = lesson4;
        System.out.println(lesson2);

    }
}

