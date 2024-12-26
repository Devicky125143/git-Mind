package FrameHandling;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class working_withframes {
public static void main(String[] args) throws Exception {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.automationtesting.in/Frames.html");
	Thread.sleep(2000);
	
	//total frames
	
     List<WebElement>frames=driver.findElements(By.tagName("iframe"));
     System.out.println(frames.size());
	
	//String name or Id 
     
//	driver.switchTo().frame("singleframe");//3 ways --->String name are id , int index, webelement element obj
//	driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Atchutarao");
//	
	//webelement elementObject
	
//	WebElement ele = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
//	driver.switchTo().frame(ele);
//	driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Atchutarao");
	
	//int index 
     
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Atchutarao");

	//default content is used to switch the parent frame 
	
	//takesscreenshot
	
	TakesScreenshot ts= (TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	
	File dest= new File("C:\\Users\\vicky\\OneDrive\\Desktop\\AUTOMATION_SELENIUM\\SuryaBhaiAutomation\\Screenshot\\frame.png");
	Files.copy(src, dest);
			
}
}
