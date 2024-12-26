package Fileuploding;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exceltablehandling {
	 public static void main(String[] args) throws IOException {
		  String path="C:\\Users\\vicky\\OneDrive\\Desktop\\Extent.xlsx";
		  
		  FileInputStream fisp= new FileInputStream(path);
		  XSSFWorkbook wb= new XSSFWorkbook(fisp);
		  XSSFSheet sheet= wb.getSheet("Sheet1");
		  int row=sheet.getLastRowNum();
		  int cell=sheet.getRow(0).getLastCellNum();
		  System.out.println(row+"\n"+cell);
		  
		  //print the data 
		  
		  for(int i=0;i<row;i++) {
			  XSSFRow Rows = sheet.getRow(i);
			  for(int j=0;j<cell;j++) {
				  String values = Rows.getCell(j).toString();
				  System.out.println(values);
			  }
					  
		  }
		  
		  
	 }
	 
}
