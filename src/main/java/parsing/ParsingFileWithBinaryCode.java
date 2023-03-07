package parsing;

import java.io.*;
import java.util.Base64;
import java.util.UUID;

public class ParsingFileWithBinaryCode {
    public static void main(String[] args) throws IOException {
//        File gff = new File("src/main/resources/photo.jpg");
////        byte[] f = Files.readAllBytes(Path.of("src/main/resources/Test2.pdf"));
//       String f2 = f.toString();
//        System.out.println(f2);

//        try {
            FileInputStream fis = new FileInputStream(new File("src/main/resources/TestPNG.png"));
            String f = new String(Base64.getEncoder().encode(fis.readAllBytes()));
            System.out.println(f);
//            fis.close();
//
//            }
//        catch (IOException ex) {
//            ex.printStackTrace();
//        }

        System.out.println(UUID.randomUUID());
    }
}

