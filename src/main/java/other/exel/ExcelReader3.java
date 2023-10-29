package other.exel;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader3 {
    public static void main(String[] args) throws IOException {
        String filePath = "src/main/resources/TestExel.xlsx";
        ExcelReader3 excelReader3 = new ExcelReader3();
        System.out.println(excelReader3.getCellValue(filePath, "Номер заявки"));
    }

    public static String getCellValue(String filePath,String columnName) {
        String cellValue = null;

        try (FileInputStream file = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(file)) {

            Sheet sheet = workbook.getSheetAt(0);
            if (sheet == null) {
                throw new IllegalArgumentException("Sheet not found");
            }

            Row headerRow = null;
            for (Row row : sheet) {
                if (row.getFirstCellNum() >= 0) {
                    headerRow = row;
                    break;
                }
            }

            if (headerRow == null) {
                throw new IllegalStateException("No header row found");
            }

            int columnIndex = -1;
            for (Cell cell : headerRow) {
                String headerCellValue = cell.getStringCellValue();
                if (headerCellValue.equalsIgnoreCase(columnName)) {
                    columnIndex = cell.getColumnIndex();
                    break;
                }
            }

            if (columnIndex == -1) {
                throw new IllegalArgumentException("Column not found: " + columnName);
            }

            Row dataRow = sheet.getRow(1);
            if (dataRow != null) {
                Cell dataCell = dataRow.getCell(columnIndex);
                if (dataCell != null) {
                    switch (dataCell.getCellType()) {
                        case STRING:
                            cellValue = dataCell.getStringCellValue();
                            break;
                        case NUMERIC:
                            if (DateUtil.isCellDateFormatted(dataCell)) {
                                cellValue = dataCell.getDateCellValue().toString();
                            } else {
                                cellValue = String.valueOf(dataCell.getNumericCellValue());
                            }
                            break;
                        case BOOLEAN:
                            cellValue = String.valueOf(dataCell.getBooleanCellValue());
                            break;
                        case FORMULA:
                            cellValue = dataCell.getCellFormula();
                            break;
                        default:
                            cellValue = "";
                            break;
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return cellValue;
    }



}
