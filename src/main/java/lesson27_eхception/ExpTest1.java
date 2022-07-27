package lesson27_eхception;

import java.io.*;

public class ExpTest1 {
    public static void main(String[] args) {
        File file = new File("D:\\Projects\\StudyJavaUdemy\\src\\test.txt");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(111);
        }
        catch (FileNotFoundException e){
            System.out.println("Файл для ввода текста не найден");
        }
        catch (IOException e) {
            System.out.println("Запись файла не возможна");
        }
    }
}
