package other.exel;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class Parser3 {
    public static void main(String[] args) {
        Parser3 parser3 = new Parser3();
        parser3.testParse("Отчество");
    }

    public void testParse(String value) {
        String filePath = "src/main/resources/TestExel.xlsx";
        String elementToFind = "Отчество";

        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0); // Получаем первый лист в файле

            for (Row row : sheet) {
                Iterator<Cell> cellIterator = row.cellIterator();

                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
                    if (cell.getCellType() == CellType.STRING) {
                        String cellValue = cell.getStringCellValue();
                        if (cellValue.equals(elementToFind)) {
                            System.out.println("Элемент найден в файле!");
                            System.out.println("что то " + row.getRowNum());
//                            System.out.println("Строка: " + (row.getRowNum() + 1));
//                            System.out.println("Столбец: " + (cell.getColumnIndex() + 1));
                            row = sheet.getRow(row.getRowNum());
                            cell = row.getCell(cell.getColumnIndex());
                            String s = cell.getStringCellValue();
                            System.out.println("Индекс " + s);
                            return;
                        }
                    }

                }
            }

            System.out.println("Элемент не найден в файле.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
