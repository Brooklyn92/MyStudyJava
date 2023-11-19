package udemy_base_java.lesson15_while__doWhile;

public class Test10 {
    public static void main(String[] args) {
       OUTER: for (int hour=0; hour<24; hour++){
            int minuta = 0;
            INNER:while (minuta<60){
                System.out.println(hour+":" + minuta);
                minuta++;
            }
        }
    }
}
