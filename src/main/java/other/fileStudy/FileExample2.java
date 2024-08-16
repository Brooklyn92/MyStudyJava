package other.fileStudy;

import java.io.File;
import java.io.IOException;

public class FileExample2 {
    public static void main(String[] args) {
        FileExample2 fileExample2 = new FileExample2();
        fileExample2.createFile("src/main/resources/files/file1.txt");

    }

    public void createFile(String filePath) {
        File file = new File(filePath);
        if (file.exists()) {
            System.out.println("Файл существует");
        }
        else {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
