package other.fileStudy;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileExample1 {
    public static void main(String[] args) throws IOException {
        String data = "Test data";
        FileOutputStream out = new FileOutputStream("src/main/resources/files/testFile2.txt");
        out.write(data.getBytes());
        out.close();

    }
}
