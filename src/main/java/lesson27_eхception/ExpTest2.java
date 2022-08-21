package lesson27_eхception;

import java.io.*;

public class ExpTest2 {
    FileInputStream inp1, inp2;
    public void abc() {
      try {
          inp1 = new FileInputStream("src/test2.txt");
          try {
              inp2 = new FileInputStream("src/test.txt");
          }
          catch (FileNotFoundException e) {
              System.out.println("Файл test2.txt не найден");
          }
      } catch (FileNotFoundException e) {
          System.out.println("Файл test2.txt не найден"); //Файл test2.txt не найден
      }
      finally {
          System.out.println("Это внешний finally блок");
          try {
              inp1.close(); // NullPointerException
              inp1.close();
          } catch (IOException e) {
              System.out.println("Найдено исключение в finally блоке");
          }
      }
    }

    public static void main(String[] args) {
        ExpTest2 expTest2 = new ExpTest2();
        expTest2.abc();
    }

}
