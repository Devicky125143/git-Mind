package Action_Class;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class actionclass {
   public static void main(String[] args) throws Exception {
	WebDriver driver= new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.meesho.com/");
	 WebElement men = driver.findElement(By.xpath("(//div[@class='NavBarDesktop__Subtitle-sc-xsryom-0 izctWK'])[3]"));
	 Actions a= new Actions(driver);
	 
	 //move to Element
	 a.moveToElement(men).perform();        //Diffrent Xpath --> //*[text()='']
	 
	 Thread.sleep(3000);
	 //screen shot 
	 
	 TakesScreenshot ts= (TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dest= new File("C:\\Users\\vicky\\OneDrive\\Desktop\\AUTOMATION_SELENIUM\\SuryaBhaiAutomation\\Screenshot\\move.png");
	 Files.copy(src, dest);
	 
	 
	 
	 Thread.sleep(3000);                    //Pouse The inspact page--> source-->point the element-->ctrl+\
	 driver.findElement(By.xpath("(//*[text()='Jeans'])[4]")).click();
	 
	 //context click
	 WebElement man2 = driver.findElement(By.xpath("(//div[@class='NavBarDesktop__Subtitle-sc-xsryom-0 izctWK'])[3]"));
	  Actions act= new Actions(driver);
	  act.moveToElement(man2).contextClick().perform();
	  Thread.sleep(3000);
	  
	  
	  //double click
	  
	  WebElement man3 = driver.findElement(By.xpath("(//div[@class='NavBarDesktop__Subtitle-sc-xsryom-0 izctWK'])[3]"));
	   Actions act1= new Actions(driver);
	    act1.moveToElement(man3).doubleClick().perform();
	    
	    System.out.println("Test Passed");
	    
	  
}
}
