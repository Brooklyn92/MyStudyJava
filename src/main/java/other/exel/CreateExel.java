package other.exel;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileOutputStream;

public class CreateExel {
    public static void main(String[] args) {
        try (Workbook workbook = WorkbookFactory.create(true)) {
            Sheet sheet = workbook.createSheet("Sheet1");

            Row headerRow = sheet.createRow(0);
            headerRow.createCell(0).setCellValue("Column 1");
            FileOutputStream fileOut = new FileOutputStream("workbook.xlsx");
            workbook.write(fileOut);
            fileOut.close();

            System.out.println("Excel файл успешно создан!");
        } catch (Exception e) {
            System.out.println("Возникла ошибка при создании Excel файла: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
