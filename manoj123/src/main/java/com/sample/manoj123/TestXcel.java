package com.sample.manoj123;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestXcel {

	public static void main(String[] args) throws IOException {
	
		FileInputStream fi= new FileInputStream("C:\\Users\\vemulapelli manoj\\OneDrive");
		Workbook wb=new HSSFWorkbook(fi);
  Sheet ws= wb.getSheet("Sheet1");
  Row row=ws.getRow(1);
  Cell cell=row.createCell(3);
  cell.setCellValue("true");
  FileOutputStream fo=new  FileOutputStream("Results.xls");
  wb.write(fo);
  wb.close();
  fi.close();
  fo.close();
	}

}
