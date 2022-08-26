package org.ExcelOperators;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.Cell;

public class Ex3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.out.println("*** Program Starts***");
		FileInputStream fis = new 	FileInputStream("D:\\Maven\\OM\\excelFiles\\TestData.ou.xls");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s1 = wb.getSheet("AllStringType");
		int lastRowNum = s1.getLastRowNum();
		System.out.println("lastRowNum : "+lastRowNum);
		int physicalRows = s1.getLastRowNum();
		System.out.println("physicalRows : "+physicalRows);

		Row r1 = s1.getRow(1);
		int lastCellNum = r1.getLastCellNum();
		int physicalCells = r1.getPhysicalNumberOfCells();
		System.out.println("lastCellNum : "+lastCellNum);
		System.out.println("physicalCells : "+physicalCells);

		Cell c1 = r1.getCell(0);
		System.out.println("R2, C1 :"+c1.getStringCellValue());
		System.out.println("R2, C1 : "+r1.getCell(0).getStringCellValue());


		System.out.println("*** Program Ends***");


	}

}
