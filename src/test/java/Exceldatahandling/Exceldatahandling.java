package Exceldatahandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Exceldatahandling {

	@Test
	
	public void tc1() throws IOException {
		String path="C:\\Users\\vicky\\OneDrive\\Desktop\\family.xlsx";
		//store the file
		File f= new File(path);
		//read the file 
		FileInputStream fis= new FileInputStream(f);
		//load the file
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		//find the sheet in workbook
		XSSFSheet sheet=wb.getSheet("data");
		//find the how many rows in sheet 
		int rows=sheet.getLastRowNum();
		System.out.println("Rows count : "+rows);
		int cols=sheet.getRow(0).getLastCellNum();
		System.out.println("columns : "+cols);
		
		for (int i=0;i<rows;i++) {//read to use each row 
			XSSFRow row=sheet.getRow(i);
			for(int j=0;j<cols;j++) {//read to use each cell on current row
			String	values=row.getCell(j).toString();
			System.out.println(values);
			}
		}
		
		
		
	}
}
