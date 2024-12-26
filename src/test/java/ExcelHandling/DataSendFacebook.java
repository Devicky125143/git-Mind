package ExcelHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataSendFacebook {
	@Test()
	public void TC1() throws IOException {
		String path="C:\\Users\\vicky\\OneDrive\\Desktop\\Info.xlsx";
		File f= new File(path);
		FileInputStream fis= new FileInputStream(f);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet= wb.getSheet("Sheet1");
	   WebDriver driver= new ChromeDriver();
	   driver.get("https://www.facebook.com");
	   driver.findElement(By.xpath("//input[@type='text']")).sendKeys(sheet.getRow(1).getCell(1).getStringCellValue());
		
		
		
	}
}
