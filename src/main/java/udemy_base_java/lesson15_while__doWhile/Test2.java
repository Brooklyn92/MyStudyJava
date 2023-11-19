package udemy_base_java.lesson15_while__doWhile;

public class Test2 {
    public static void main(String[] args) {
        int money = 100;
        while (money>0) {
            System.out.println("Делайте ставку");
            System.out.println("Вы проиграли");
            System.out.println("================");
            money-=10;
        }
    }
}
