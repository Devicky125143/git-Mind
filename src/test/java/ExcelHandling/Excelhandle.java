package ExcelHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excelhandle {
  
	@Test
	public void Tc1() throws IOException {
		String path="C:\\Users\\vicky\\OneDrive\\Desktop\\Info.xlsx";
		File f= new File(path);
		FileInputStream fis= new FileInputStream(f);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet= wb.getSheet("Sheet1");
		XSSFRow row=sheet.getRow(1);
		XSSFCell cell=row.getCell(1);
		String data=cell.getStringCellValue();
		System.out.println(data);
		
		//find the rows in sheet
		int rows=sheet.getLastRowNum();
		int cols=row.getLastCellNum();
		for(int i=1;i<rows;i++ ) {
			for(int j=0;j<cols;j++) {
				System.out.println(sheet.getRow(i).getCell(j).getStringCellValue()+"|");
				
			}
			
		}
	}
}
