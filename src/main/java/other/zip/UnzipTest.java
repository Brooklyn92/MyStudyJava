package other.zip;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class UnzipTest {
    public static void main(String[] args) {
        File file = new File("src/main/resources/testing.zip");
        String destDir = "src/main/resources"; // Укажите путь к папке, в которую нужно распаковать
        UnzipTest unzipTest = new UnzipTest();
        unzipTest.unzip(file, destDir);
    }

    public void unzip(File zipFilePath, String destDir) {
        byte[] buffer = new byte[1024];

        try (ZipInputStream zis = new ZipInputStream(new FileInputStream(zipFilePath), Charset.forName("CP866"))) {
            ZipEntry zipEntry = zis.getNextEntry();

            while (zipEntry != null) {
                String fileName = zipEntry.getName();
                File newFile = new File(destDir + File.separator + fileName);

                new File(newFile.getParent()).mkdirs();

                try (FileOutputStream fos = new FileOutputStream(newFile)) {
                    int len;
                    while ((len = zis.read(buffer)) > 0) {
                        fos.write(buffer, 0, len);
                    }
                }

                zipEntry = zis.getNextEntry();
            }

            System.out.println("Успешно распаковано!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
