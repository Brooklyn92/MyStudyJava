package udemy.lesson15_while__doWhile.hw15;

public class HW15 {
    static void time() {
        int hour=0;
        OUTER:while (hour<6){
            int min=-1;
           MIDDLE: do {
                min++;
                if (hour>1 && min%10==0) {
                   break OUTER;
                }
                int sec=0;
                while (sec<60) {
                    if (sec*hour>min) {
                        continue MIDDLE;
                    }
                    System.out.println(hour+":"+ min + ":" + sec);
                    sec++;
                }
            }
            while (min<59);
            hour++;
        }
    }

    public static void main(String[] args) {
        time();
    }
}
