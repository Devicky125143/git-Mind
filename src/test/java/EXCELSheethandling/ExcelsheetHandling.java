package EXCELSheethandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelsheetHandling {
   
	@Test
	public void TC1() throws IOException {
		//path storing in a variable 
		String path="C:\\Users\\vicky\\OneDrive\\Desktop\\family.xlsx";
		//find the path 
		File f= new File(path);
		//read the file
		FileInputStream fis= new FileInputStream(f);
		//load the file 
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		//find the sheet in wb
		XSSFSheet sheet= wb.getSheet("data");
		//find the row 
		XSSFRow row=sheet.getRow(18);
		//find the cell 
		XSSFCell cell=row.getCell(5);
		//data type in cell
		String data=cell.getStringCellValue();
		System.out.println(data);
        System.out.println(sheet.getRow(19).getCell(6).getStringCellValue());		
        XSSFRow row1=sheet.getRow(20);
        XSSFCell cell1=row1.getCell(7);
          String data1=cell1.getStringCellValue();
          System.out.println(data1);
		
	
	}
}
