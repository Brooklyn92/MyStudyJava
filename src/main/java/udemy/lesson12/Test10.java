package udemy.lesson12;

public class Test10 {
    public static void main(String[] args) {
        int a=30;
        if (a<20) {
            System.out.println("a menshe 20");
        }
        else if(a==30) {
            System.out.println("a equal 30");
        }
        else {
            System.out.println("a bolshe 20");
        }
        int y =20;
        int x = 10;
        int m = (y>x)?y:x; //ternary оператор
        System.out.println(m);
    }
}
