package other.exel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReadExelTest1 {
    public static void main(String[] args) {
        ReadExelTest1 exelTest1 = new ReadExelTest1();
        exelTest1.parse("Иванович");
    }

    public void parse(String value) {
        List<String> list = new ArrayList<>();
        String filePath = "src/main/resources/TestExel.xlsx";
        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0); // Читаем первый лист

            Iterator<Row> rowIterator = sheet.iterator();
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();

                Iterator<Cell> cellIterator = row.cellIterator();
                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();

                    String cellValue = "";
                    switch (cell.getCellType()) {
                        case STRING:
                            cellValue = cell.getStringCellValue();
                            break;
                        case NUMERIC:
                            cellValue = String.valueOf(cell.getNumericCellValue());
                            break;
                        case BOOLEAN:
                            cellValue = String.valueOf(cell.getBooleanCellValue());
                            break;
                        case BLANK:
                            cellValue = "";
                            break;
                        default:
                            cellValue = "";
                    }

                    System.out.print(cellValue + "\t");
                    list.add(cellValue);
                }

                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String number  = list.stream().filter(el -> el.equals(value)).findFirst().orElse(null);
        System.out.println("Найденное значение: " + number);
    }
}
