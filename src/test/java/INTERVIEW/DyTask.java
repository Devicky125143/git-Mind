package INTERVIEW;


import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class DyTask {
  public static void main(String[] args) throws Exception {
	 WebDriver driver= new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.dezlearn.com/webtable.example/");
	  Thread.sleep(2000);
	  
	JavascriptExecutor  js= (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,200)");
	
	WebElement table=driver.findElement(By.xpath("//table[@class='tg']"));
	
	//find the rows 
	List<WebElement> Rows = table.findElements(By.tagName("tr"));
	System.out.println("RowsCount "+Rows.size());
	
	//Find the Headings
	
	List<WebElement> Heads = table.findElements(By.tagName("th"));
	System.out.println("Heading Count "+Heads.size());
	
	//print the headings
	for(int i=0;i<Heads.size();i++) {
		System.out.println(Heads.get(i).getText());
	}
	
	//find the columns
	
	List<WebElement> Columns = table.findElements(By.tagName("td"));
	System.out.println("Columns Count "+Columns.size());
	
	//each column
	for(int i=1;i<Rows.size();i++) {
	        List<WebElement> Col = Rows.get(i).findElements(By.tagName("td"));
	        System.out.println("Rows "+i+ " = "+ Col.size());
	}
	
	//1st row enter the name 
	for(int i=1;i<Rows.size();i++) {
		List<WebElement> CL = Rows.get(i).findElements(By.tagName("td"));
		for(int j=1;j<CL.size();j++) {
			if(i==1&&j==5) {
				CL.get(j).findElement(By.tagName("input")).sendKeys("ATCHUTARAO");
			}
			else if(i==2&&j==4) {
				WebElement Sl = CL.get(j).findElement(By.tagName("select"));
				Select s= new Select(Sl);
				s.selectByVisibleText("Sports");
			}
			else if(i==3&&j==3) {
				WebElement CheckBox = CL.get(j).findElement(By.tagName("input"));
				CheckBox.click();
			}
			else if(i==4&&j==2) {
				WebElement CheckBox1 = CL.get(j).findElement(By.tagName("input"));
				CheckBox1.click();
				
			}
			else if(i==5&&j==4) {
				WebElement dropdown = CL.get(j).findElement(By.tagName("select"));
				 Select s2=new Select(dropdown);
				 s2.selectByVisibleText("Suv");
			}
			else if(i==6&&j==5) {
				WebElement Addtext = CL.get(j).findElement(By.tagName("input"));
				Addtext.sendKeys("TEST PASSED");
			}
		
			
		}
	}
	TakesScreenshot ts= (TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dest= new File("C:\\Users\\vicky\\OneDrive\\Desktop\\AUTOMATION_SELENIUM\\SuryaBhaiAutomation\\Screenshot\\Table.png");
	Files.copy(src, dest);
	
	
	
	
}
}
