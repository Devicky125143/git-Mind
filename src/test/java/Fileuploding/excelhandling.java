package Fileuploding;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelhandling {
	
   public static void main(String[] args) throws IOException {
	  String path="C:\\Users\\vicky\\OneDrive\\Desktop\\Extent.xlsx";
	  FileInputStream fisp= new FileInputStream(path);
	  XSSFWorkbook wb= new XSSFWorkbook(fisp);
	  XSSFSheet sheet=wb.getSheet("Sheet1");
	  XSSFRow row=sheet.getRow(0);
	  XSSFCell cell=row.getCell(0);
	  
	    System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
	    
	    
	    
	     
	    
	     
	    
}
}
