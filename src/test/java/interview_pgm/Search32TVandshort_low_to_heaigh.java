package interview_pgm;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Search32TVandshort_low_to_heaigh {
   public static void main(String[] args) throws AWTException {
	 WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.flipkart.com/");
	  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("32 inches smart TV");
	  Robot r= new Robot();
	  r.keyPress(KeyEvent.VK_ENTER);
	  r.keyRelease(KeyEvent.VK_ENTER);
	  
	 WebElement min = driver.findElement(By.xpath("(//select[@class='Gn+jFg'])[1]"));
    
	 Select s= new Select(min);
	 s.selectByIndex(2);
   
   
   }
}
