package Fileuploding;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {
   public static void main(String[] args) {
	 WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demo.automationtesting.in/Frames.html");
	  
	  //find the frames in the page 
	List<WebElement> Frames = driver.findElements(By.tagName("iframe"));
	System.out.println(Frames.size());
	//find the user frame 
//	WebElement FRAME = driver.findElement(By.id("singleframe"));
//	driver.switchTo().frame(FRAME);
//	driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("atchutarao");
//	
	//switch to user frame through xpath
	
	WebElement ele = driver.findElement(By.xpath("//iframe[@name='SingleFrame']"));
	driver.switchTo().frame(ele);
	driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("atchutarao");
	
	
	
}
}
