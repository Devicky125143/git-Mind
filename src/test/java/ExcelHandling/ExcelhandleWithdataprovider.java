package ExcelHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelhandleWithdataprovider {
	
	@Test(dataProvider = "Data1")
	public void TC1(String Un, String pwd) {
		System.out.println(Un+" "+pwd);
		
	}
	
	
	@DataProvider(name="Data1")
	public String[][] DataPro() throws IOException {
		String path="C:\\Users\\vicky\\OneDrive\\Desktop\\Info.xlsx";
		File f= new File(path);
		FileInputStream fis= new FileInputStream(f);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet= wb.getSheet("Sheet1");
	
//		XSSFRow row=sheet.getRow(1);
//   	XSSFCell cell=row.getCell(1);
		//String data=cell.getStringCellValue();
		//System.out.println(data);
		
		int rows=sheet.getLastRowNum();
		int cols=sheet.getRow(0).getLastCellNum();
		
		
	 String arr[][]=new String[rows][cols];
	 
		for(int i=1;i<=rows;i++) {
			for(int j=0;j<cols;j++) {
				arr[i-1][j]=sheet.getRow(i).getCell(j).getStringCellValue();
			}
				
			}
		return arr;
		}
}
