package experiment.zip;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipFileExperiment {
    public static void main(String[] args) {

        try(ZipInputStream zin = new ZipInputStream(new FileInputStream("src/main/resources/testing.zip"), Charset.forName("CP866")))
        {
            ZipEntry entry;
            String name;
            while((entry=zin.getNextEntry())!=null){

                name = entry.getName(); // получим название файла
                System.out.printf("File name: %s \n", name);

                // распаковка
                FileOutputStream fout = new FileOutputStream("src/main/resources/testing.zip/"+ name);
                for (int c = zin.read(); c != -1; c = zin.read()) {
                    fout.write(c);
                }
                fout.flush();
                zin.closeEntry();
                fout.close();
            }
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
    }
}
