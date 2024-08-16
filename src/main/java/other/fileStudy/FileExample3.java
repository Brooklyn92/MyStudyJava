package other.fileStudy;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileExample3 {
    public static void main(String[] args) throws IOException {
//        Workbook workbook = new XSSFWorkbook();
//
//        // Создаем лист
//        Sheet sheet = workbook.createSheet("Sheet1");
//
//        // Создаем строку
//        Row row = sheet.createRow(0);
//
//        // Создаем ячейку и устанавливаем в нее значение
//        Cell cell = row.createCell(0);
//        cell.setCellValue("Привет, мир!");
//
//        // Сохраняем книгу в файл
//        try (FileOutputStream fileOut = new FileOutputStream("src/main/resources/files/workbook.xlsx")) {
//            workbook.write(fileOut);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        // Закрываем книгу, чтобы освободить ресурсы
//        try {
//            workbook.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
