package lesson27_eхception;

import java.io.*;

public class ExpTest1 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\Projects\\StudyJavaUdemy\\src\\test.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(111);
    }
}
