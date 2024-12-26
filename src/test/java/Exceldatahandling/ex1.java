package Exceldatahandling;



	import java.io.File;
	import java.io.FileInputStream;
	import java.io.IOException;

	import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;


	public class ex1 {
		@Test
		public void tc1() throws IOException
		{
			
		
		String path="C:\\Users\\vicky\\OneDrive\\Desktop\\family.xlsx";
		File f=new File(path);
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("data");
		XSSFRow row=sheet.getRow(1);
		XSSFCell cell=row.getCell(1);
		
		String data=cell.getStringCellValue();
		System.out.println(data);
		
		int rows = sheet.getLastRowNum();
		System.out.println("rows = "+rows);
		int cols = row.getLastCellNum();
		System.out.println("cols = "+cols);
		
		
		for(int i=1;i<=rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(sheet.getRow(i).getCell(j).getStringCellValue()+"|");
			}
			System.out.println();
		}	
		System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());
		
		}
		
		@Test
		public void t2() throws IOException {
			
			String path="C:\\Users\\MSI\\Desktop\\Book1.xlsx";
			File f=new File(path);
			FileInputStream fis=new FileInputStream(f);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sheet=wb.getSheet("Sheet1");
		   	WebDriver driver = new ChromeDriver();
		   	driver.get("https://www.facebook.com");
		   	driver.findElement(By.xpath("//input[@id='email']")).sendKeys(sheet.getRow(1).getCell(0).getStringCellValue());
		}
		
		@Test(dataProvider = "data")
		public void testdp(String un,String pwd) {
			System.out.println(un+" "+pwd);
		}
		
		@DataProvider(name="data")
		public String [][] getData() throws IOException {
			
			String path="C:\\Users\\MSI\\Desktop\\Book1.xlsx";
			File f=new File(path);
			FileInputStream fis=new FileInputStream(f);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sheet=wb.getSheet("Sheet1");
			
			int rows = sheet.getLastRowNum();
			int cols = sheet.getRow(1).getLastCellNum();
			
			String [][] values = new String[rows][cols];
			
			
			for(int i=1;i<=rows;i++) {
				for(int j=0;j<cols;j++) {
					values[i-1][j]=sheet.getRow(i).getCell(j).getStringCellValue();
				  
				}
			}	
			return values;
		}
	}
	
