package Alert_popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoqa_app {
  public static void main(String[] args) throws Exception {
	 WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demoqa.com/alerts");
	  Thread.sleep(3000);
	  JavascriptExecutor js= (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,500)");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
	     Thread.sleep(2000);
	     Alert btn1=driver.switchTo().alert();
	     btn1.accept();
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
	     Thread.sleep(8000);
	     Alert btn2=driver.switchTo().alert();
	     btn2.accept();
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
	     Thread.sleep(2000);
	     Alert btn3=driver.switchTo().alert();
	     btn3.getText();
	     Thread.sleep(3000);
	      driver.findElement(By.id("(//button[@type='button'])[5]")).click();
	      Thread.sleep(2000);
	       Alert btn4=driver.switchTo().alert();
	       btn4.sendKeys("ATCHUTARAO");
	       btn4.accept();
	       System.out.println(btn4);
	       Thread.sleep(2000);
	       driver.quit();
	      
}
}
