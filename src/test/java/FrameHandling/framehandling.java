package FrameHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framehandling {
   public static void main(String[] args) {
	 WebDriver driver= new ChromeDriver();
	  driver.get("");
	  //find the how many frames in the webpage
	  List<WebElement> Frame = driver.findElements(By.tagName("frame"));
	  System.out.println(Frame.size());
	  //switch to frame
	  driver.switchTo().frame("");
	  driver.findElement(By.xpath("")).sendKeys("");
	  
	 WebElement frm = driver.findElement(By.xpath(""));
	 driver.switchTo().frame(frm);
	 driver.findElement(By.xpath("")).sendKeys("");
	 
	 driver.switchTo().frame(0);
	 driver.findElement(By.xpath("")).sendKeys("");
}
}
