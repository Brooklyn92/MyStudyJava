package udemy.lesson4;

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
       /* Lesson4 udemy.lesson4 = new Lesson4(1,"Alex",12.12);
        System.out.println(udemy.lesson4);
        System.out.println("Client info: " + udemy.lesson4.id + " " + udemy.lesson4.name + " " + udemy.lesson4.balance);
        Lesson4 udemy.lesson2 = udemy.lesson4;
        System.out.println(udemy.lesson2);
        */
        Lesson4 lesson1= new Lesson4(2,"Alex", 200.5);
        lesson1.poplnennieScheta(200);
        lesson1.snyatieScheta(100);

    }
}

