package EXCELSheethandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excelread {
   @Test
   public void TC1() throws IOException {
	   //path of excel sheet
	   String path="C:\\Users\\vicky\\OneDrive\\Desktop\\mydata.xlsx";
	   //find the path file 
	   File f= new File(path);
	   //read the file
	   FileInputStream fisp=new FileInputStream(f);
	   //Load the file 
	   XSSFWorkbook wb= new XSSFWorkbook(fisp);
	   //devide the workbook
	   //sheet
	   XSSFSheet sheet=wb.getSheet("sheet1");
	   //in sheet find the row 
	   XSSFRow row=sheet.getRow(15);
	   //in row find the  cell
	   XSSFCell cell=row.getCell(11);
	   //which kind of data in a cell like numarical,String
	   String data = cell.getStringCellValue();
	   System.out.println(data);
	   
	   //simple to get the data in excel file 
	   
	   System.out.println(sheet.getRow(15).getCell(12).getStringCellValue());
	   
	   
	   
	  
   }
}
