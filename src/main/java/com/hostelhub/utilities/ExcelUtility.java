package com.hostelhub.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

    public static String getData(int row, int cell) throws IOException {

    	String path = "C:\\Users\\jeevi\\eclipse-workspace\\HostelHub_AutomationFramework\\testdata\\LoginData.xlsx";

        FileInputStream fis = new FileInputStream(path);

        XSSFWorkbook workbook = new XSSFWorkbook(fis);

        XSSFSheet sheet = workbook.getSheet("LoginData");

        String data = sheet.getRow(row).getCell(cell).getStringCellValue();

        workbook.close();

        return data;
    }
}