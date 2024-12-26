package TEST;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;


public class flipcarttest {
   public static void main(String[] args) throws InterruptedException {
	 WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	   driver.get("https://www.flipkart.com/");
	   Thread.sleep(5000);
	   
	  WebElement search=driver.findElement(By.xpath("//input[@class='Pke_EE']"));
	  search.sendKeys("Iphone 14pro Max");
	   search.submit();
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[2]")).click();
	   
	   List<WebElement> products = driver.findElements(By.xpath("//li[@class='_7eSDEz']"));
	        
	       for(int i=0;i<products.size();i++) {
	    	   System.out.println(products.get(i).getText());
	     }
	   
}
}
