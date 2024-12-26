package Naukari_application_Test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class apptest {
  public static void main(String[] args) throws Exception {
	 WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.naukri.com/");
	  String parent= driver.getWindowHandle();
	  WebElement Regbtn = driver.findElement(By.xpath("//a[@class='nI-gNb-lg-rg__register']"));
	  Regbtn.click();
	  Thread.sleep(3000);
	   driver.findElement(By.xpath("//button[@type='button']")).click();
	   
	   Set<String>allwindows=driver.getWindowHandles();
	   System.out.println(allwindows.size());
	   
	   for(String child:allwindows) {
		   if(!parent.equals(allwindows)) {
			   driver.switchTo().window(child);
		   }
	   }
	   Thread.sleep(2000);
	    WebElement childpage = driver.findElement(By.xpath("//input[@type='email']"));
	    childpage.sendKeys("atchutarao@gmail.com");
	  
	  
}
}
