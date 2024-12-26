package INTERVIEW;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;import Abstraction_Methods.webelement_color_print;

public class tablehandilingpractice {
  public static void main(String[] args) {
	 WebDriver driver= new ChromeDriver();
	  driver.get("");
	  WebElement table = driver.findElement(By.tagName("table"));
	   List<WebElement> rows = table.findElements(By.tagName("tr"));
	   System.out.println(rows.size());
	   
	   List<WebElement> th=table.findElements(By.tagName("th"));
	   System.out.println(th.size());
	   
	   List<WebElement>td=table.findElements(By.tagName("td"));
	   System.out.println(td.size());
	   
	   for(int i=1;i<rows.size();i++) {
		    List<WebElement> data = table.findElements(By.tagName("td"));
		    System.out.println(i+" "+data.size());
		   
	   }
}
}
