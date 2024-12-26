package Exceldatahandling;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class allexceldata {
 @Test
 public void TC1() throws IOException {
	 //file read
	 FileInputStream fisp=new FileInputStream("C:\\Users\\vicky\\OneDrive\\Desktop\\family.xlsx");
	 //load the file
	 XSSFWorkbook wb= new XSSFWorkbook(fisp);
	 //find the sheet in workbook
	 XSSFSheet sheet= wb.getSheet("data");
	 //find the how many ros in the sheet
	   int Rows=sheet.getLastRowNum();
	 //find the how many columns in the sheet
	 int  cols= sheet.getRow(6).getLastCellNum();
 
      System.out.println("ROWS count : "+Rows);
      System.out.println("columns count : "+cols);
      
      // read to use the each row 
      for(int i=6;i<Rows;i++) {//read to use the each row 
    	  XSSFRow currentrow=sheet.getRow(i);
    	  
    	  for(int j=7;j<cols;j++) {//read to use the each column in current row
                String   values=currentrow.getCell(j).toString();
                System.out.println(values );
    	  }
      }
 
 }
}
