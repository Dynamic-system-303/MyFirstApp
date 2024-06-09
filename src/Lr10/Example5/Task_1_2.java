package Lr10.Example5;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class Task_1_2 {
    public static void main(String[] args) throws IOException {
        String filePath = "src/Lr10/Example5/Example5.xlsx";
        FileInputStream inputStream = new FileInputStream(filePath);

        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

        XSSFSheet sheet = workbook.getSheet("Товары");  // строка с несущ. названием листа

        if (sheet != null) {
            // Проверяем, что объект sheet не равен null
            Iterator<Row> rowIterator = sheet.iterator();
            // Далее выполняем необходимые действия с данными из строки
            for (Row row : sheet) {
                for (Cell cell : row) {
                    System.out.println(cell.toString() + "\t");
                }
                System.out.println();
            }
            workbook.close();
            inputStream.close();
        } else {
            System.out.println("Запрашиваемый лист не найден! " +
                    "Поищите среди имеющихся листов:");
            // Лист не найден, обработка других листов
            Iterator<Sheet> sheetIterator = workbook.iterator();
            while (sheetIterator.hasNext()) {
                Sheet currSheet = sheetIterator.next();
                String currSheetName = currSheet.getSheetName();
                System.out.println("\t- " + currSheetName);
            }
        }
    }
}
