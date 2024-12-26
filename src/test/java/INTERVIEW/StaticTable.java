package INTERVIEW;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {
  public static void main(String[] args) {
	 WebDriver driver= new ChromeDriver();
	 driver.manage().window().maximize();
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  WebElement table = driver.findElement(By.xpath("//table[@name='BookTable']"));
	  JavascriptExecutor js= (JavascriptExecutor) driver;
	  js.executeScript("window.scrollBy(0,1500)");
	  
	  List<WebElement> rows = table.findElements(By.tagName("tr"));
	  System.out.println("Rows Count : "+rows.size());
	  
	  List<WebElement> heads= table.findElements(By.tagName("th"));
	  System.out.println("Heads Count : "+heads.size());
	  
    for(int i=0;i<heads.size();i++) {
    	System.out.println(heads.get(i).getText());
    	
    }
    
    
    List<WebElement> cols = table.findElements(By.tagName("td"));
    System.out.println("Cols count : "+cols.size());
  
    for(int i=1;i<rows.size();i++) {
    	List<WebElement> col = rows.get(i).findElements(By.tagName("td"));
    	System.out.println("Row "+i+" = "+col.size()+" cols");
    }

    System.out.println("=========================================");
    	for(int i=0;i<rows.size();i++) {
    		List<WebElement> col = rows.get(i).findElements(By.tagName("td"));
    		
    		for(int j=0;j<col.size();j++) {
    			System.out.print(col.get(j).getText()+"|");
    		
    	}
    	System.out.println();
  }  
    	driver.quit();
}
}
