package lesson14;

public class Test6 {
   public void time() {
       OUTER: for (int chas=0; chas<=23; chas++) { // пока данный цикл будет true, будет выполнятся внутренний в нём цикл for.
           System.out.println("Начало внешнего цикла");
           INNER: for (int minuta=0; minuta<=59; minuta++){
               System.out.println(chas + ":" + minuta);
               if (minuta==30){
                   break OUTER; // происходит конец во внешнем цикле при минуте = 30
               }
           }
           System.out.println("Конец внешнего цикла");
           System.out.println("===================================");
       }
       //OUTER: System.out.println("Конец внешнего циклаuuu");
   }

    public static void main(String[] args) {
        Test6 t1 = new Test6();
        t1.time();
    }
}
