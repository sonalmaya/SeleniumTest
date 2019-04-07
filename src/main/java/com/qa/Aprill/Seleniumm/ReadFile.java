package com.qa.Aprill.Seleniumm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String filePath = "C:\\Users\\HP\\eclipse-workspace\\Seleniumm";
		String fileName = "\\TestData.xlsx";
		
		File file = new File(filePath+fileName);
		FileInputStream inputSream = new FileInputStream(file);
		
		Workbook testBook = null;
		
		String extension = fileName.substring(fileName.indexOf("."));
		
		if(extension.equals(".xls"))
		{
			testBook = new HSSFWorkbook(inputSream);
		}else if (extension.equals(".xlsx")) {
			testBook = new XSSFWorkbook(inputSream);
		}else {
			throw new RuntimeException("Invalid Format");
		}
		
		Sheet sheet = testBook.getSheet("Sheet1");
		
		int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
		
		for(int i=1;i<=rowCount+1;i++) {
			Row row=sheet.getRow(i);
			
			for(int j=1;j<=row.getLastCellNum();j++) {
				
				Cell cell =row.getCell(j);
				
				CellType x = cell.getCellType();
				System.out.println(x);
				System.out.println(row.getCell(j).getStringCellValue());
			}
			
		}
		

	}

}
