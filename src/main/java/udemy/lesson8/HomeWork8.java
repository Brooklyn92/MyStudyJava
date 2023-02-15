package udemy.lesson8;

public class HomeWork8 {

    public static int umnojenie(int a, int b, int c) {
        int result = a*b*c;
        System.out.println(result);
        return  result;
    }

    public static void delenie(int y, int w) {
        double res = y/w;
        System.out.println(res);
    }
}

class HomeWork8Test1 {
    public static void main(String[] args) {
        HomeWork8.umnojenie(2,2,2);
        HomeWork8.delenie(15,3);
    }
}
