package experiment.zip;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipFileExperiment2 {
    public static void main(String[] args) throws IOException {
        ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream("src/main/resources/Desktop.zip"));
        ZipEntry entry;
        while ((entry = zipInputStream.getNextEntry()) != null) {
            System.out.println(entry.getName());
            System.out.println(entry.getSize());
        }
        zipInputStream.close();

    }
}
