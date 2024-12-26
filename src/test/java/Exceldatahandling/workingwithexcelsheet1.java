package Exceldatahandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class workingwithexcelsheet1 {
   
	public void TC1() throws IOException {
		String path="";
		File f= new File(path);
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet= wb.getSheet("");
		XSSFRow row= sheet.getRow(0);
		XSSFCell cell=row.getCell(0);
	String	data=cell.getRow().getCell(0).getStringCellValue();
	System.out.println(data);
	
	//find the row in sheet
	int rows=sheet.getLastRowNum();
	System.out.println("rows count : "+rows);
	int cells=row.getLastCellNum();
	System.out.println("columns count : "+cells);
	
	
	}
}
