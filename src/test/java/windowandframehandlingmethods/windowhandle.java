package windowandframehandlingmethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandle {
 public static void main(String[] args) {
	 WebDriver driver= new ChromeDriver();
	 driver.get("");
	 driver.findElement(By.xpath("")).click();
	 String parent = driver.getWindowHandle();
	 Set<String> allwindows = driver.getWindowHandles();
	 for(String child:allwindows) {
		 if(!parent.equals(allwindows)) {
			 driver.switchTo().window(child);
		 }
	 }
	 driver.findElement(By.xpath("")).sendKeys("atchutarao");
}
}
