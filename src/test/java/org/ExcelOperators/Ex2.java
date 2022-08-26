package org.ExcelOperators;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		System.out.println("*** Program Starts***");
		FileInputStream fis = new 	FileInputStream("D:\\Maven\\OM\\excelFiles\\TestData.ou.xls");
		Workbook wb = WorkbookFactory.create(fis);
		
		int totalSheets = wb.getNumberOfSheets();
		System.out.println("Num of Sheets  = "+totalSheets);
		
		//String SheetName = wb.getSheetName(0);
		//System.out.println("SheetName = "+SheetName);
		
		for(int i=0; i<totalSheets; i++) {
		System.out.println("wb.getSheetName("+i+") = "+wb.getSheetName(i));
		}	
	
	System.out.println("index : "+wb.getSheetIndex("AllStringType"));
	Sheet s1 = wb.getSheet("AllStringType");
	System.out.println("***Program Ends ***");
	
	}

}
