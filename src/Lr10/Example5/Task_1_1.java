package Lr10.Example5;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;


public class Task_1_1 {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();

        XSSFSheet sheet = workbook.createSheet("Работники");

        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("Работники");
        headerRow.createCell(1).setCellValue("Отдел");
        headerRow.createCell(2).setCellValue("Стаж");

        Row dataRow1 = sheet.createRow(1);
        dataRow1.createCell(0).setCellValue("Поляков С.В.");
        dataRow1.createCell(1).setCellValue("Data Science");
        dataRow1.createCell(2).setCellValue(5);

        Row dataRow2 = sheet.createRow(2);
        dataRow2.createCell(0).setCellValue("Сафронова А.П.");
        dataRow2.createCell(1).setCellValue("Сопровождения ИТ продукта");
        dataRow2.createCell(2).setCellValue(3.5);

        String filePath = "src/Lr10/Example5/Example5.xlsx";
        FileOutputStream outputSteam = new FileOutputStream(filePath);
        workbook.write(outputSteam);
        workbook.close();
        outputSteam.close();

        System.out.println("Данные записаны в файл: " + filePath);
    }
}
