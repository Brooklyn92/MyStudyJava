package other.exel;

public class ExcelReaderTest {
    public static void main(String[] args) {
//        String filePath = "src/main/resources/TestExel.xlsx";
//        try (FileInputStream fis = new FileInputStream(filePath);
//             Workbook workbook = new XSSFWorkbook(fis)) {
//
//            Sheet sheet = workbook.getSheetAt(0); // Читаем первый лист
//
//            StreamSupport.stream(sheet.spliterator(), false)
//                    .forEach(row -> StreamSupport.stream(row.spliterator(), false)
//                            .map(ExcelReader::getCellValueAsString)
//                            .forEach(cellValue -> System.out.print(cellValue + "\t")));
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        String filePath = "src/main/resources/TestExel.xlsx";
//        try (FileInputStream fis = new FileInputStream(filePath);
//             Workbook workbook = new XSSFWorkbook(fis)) {
//
//            Sheet sheet = workbook.getSheetAt(0); // Читаем первый лист
//
//            Row row = sheet.getRow(0); // Получаем первую строку
//            Cell cell = row.getCell(0); // Получаем первую ячейку
//
//            ExcelReader excelReader = new ExcelReader("src/main/resources/TestExel.xlsx"); // Создаем экземпляр класса ExcelReader
//            List<List<String>> cellValue = excelReader.readDataFromSheet(1); // Вызываем метод getCellStringValue
//
//            System.out.println("Значение ячейки: " + cellValue);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
