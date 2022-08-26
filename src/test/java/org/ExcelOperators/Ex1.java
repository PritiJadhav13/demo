package org.ExcelOperators;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


 public class Ex1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.out.println("*** Program Starts***");
		FileInputStream fis = new 	FileInputStream("D:\\Maven\\OM\\excelFiles\\TestData2.xls");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s1 = wb.getSheet("AllStringType");
		int lastRowNum = s1.getLastRowNum();
		System.out.println("lastRowNum : "+lastRowNum);
		int physicalRows = s1.getLastRowNum();
		System.out.println("physicalRows : "+physicalRows);
		System.out.println("*** Program Ends***");

	}

}