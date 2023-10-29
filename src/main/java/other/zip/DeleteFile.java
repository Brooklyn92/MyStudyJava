package other.zip;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("src/main/resources/tests.txt");
        file.delete();
    }
}
