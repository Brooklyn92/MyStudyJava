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

    public double poplnennieScheta(double popolnenie) {
        balance+=popolnenie;
        System.out.println(balance);
        return popolnenie;
    }

    public double snyatieScheta(double snyatie) {
        balance-=snyatie;
        System.out.println(balance);
        return snyatie;
    }
}

class Lesson4Test {
    public static void main(String[] args) {
       /* Lesson4 lesson4 = new Lesson4(1,"Alex",12.12);
        System.out.println(lesson4);
        System.out.println("Client info: " + lesson4.id + " " + lesson4.name + " " + lesson4.balance);
        Lesson4 lesson2 = lesson4;
        System.out.println(lesson2);
        */
        Lesson4 lesson1= new Lesson4(2,"Alex", 200.5);
        lesson1.poplnennieScheta(200);
        lesson1.snyatieScheta(100);

    }
}

