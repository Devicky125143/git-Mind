package Naukari_application_Test;

import java.io.File;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class WindowHandles {
    public static void main(String[] args) throws Exception {
		 WebDriver driver= new EdgeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.naukri.com/");
		  String parent = driver.getWindowHandle();
		  Thread.sleep(2000);
		  driver.findElement(By.linkText("Register")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//button[@type='button']")).click();
		  
		  Set<String>allwindows=driver.getWindowHandles();
		  System.out.println(allwindows.size());
		  
		  //for each loop
		  
		  for(String child:allwindows) {
			  if(!parent.equals(allwindows)){
				  driver.switchTo().window(child);
				  
			  }
		  }
		  driver.manage().window().maximize();
		   driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Devicky125@gmail.com");
		   Thread.sleep(3000);
		   
		   TakesScreenshot ts= (TakesScreenshot) driver;
		   File src = ts.getScreenshotAs(OutputType.FILE);
		   File dest= new File("C:\\Users\\vicky\\OneDrive\\Desktop\\AUTOMATION_SELENIUM\\SuryaBhaiAutomation\\Screenshot\\Mailpage.png");
		   Files.copy(src, dest);
		   
	}
}
