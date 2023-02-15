package udemy.lesson15_while__doWhile;

public class Test3 {
    public static void main(String[] args) {
        boolean b = true;
        int a = 1;
        while (b) { // цикл выводит значения до тех пор, пока и 3 и 7 не будут делить без остатка одно число
            System.out.println(a);
            if (a% 3==0 && a% 7==0) {
            break;
            }
            a++;
        }
    }
}
