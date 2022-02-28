package lesson14.hw14;

public class Hw14 {
    static void time(){
        OUTER:
        for (int hour=0; hour<=6; hour++) {
           MIDDLE:
           for (int min=0; min<=59; min++) {
            INNER:
            for (int sec=0; sec<=59; sec++) {
                    if (hour>1 & min %10 == 0){
                        break OUTER;
                    }
                    System.out.println(hour + ":" + min + ":" + sec);
                }
            }
        }
    }

    public static void main(String[] args) {
        time();
    }
}
