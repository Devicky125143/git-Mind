package windowandframehandlingmethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchto {
   public static void main(String[] args) {
	 WebDriver driver= new ChromeDriver();
	  driver.get("https://www.naukri.com/registration/createAccount");
	  driver.findElement(By.xpath("//button[@type='button']")).click();
	 String parent = driver.getWindowHandle();
	  Set<String> allwindow = driver.getWindowHandles();
	 for(String child:allwindow) {
		 if(!parent.equals(allwindow)) {
			 driver.switchTo().window(child);
		 }
	 }
	 driver.findElement(By.xpath("//input[@type='email']")).sendKeys("atchutarao");
	 
}
}
