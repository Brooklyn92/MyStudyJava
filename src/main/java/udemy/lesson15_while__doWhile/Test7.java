package udemy.lesson15_while__doWhile;

public class Test7 {
    public static void main(String[] args) {
        int money = 100;
        do {
            System.out.println("Делайте ставку");
            System.out.println("Вы проиграли");
            System.out.println("=====================");
            money-=10;
        }
        while (money>50);
    }
}
