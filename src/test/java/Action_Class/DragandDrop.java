package Action_Class;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class DragandDrop {
   public static void main(String[] args) throws Exception {
	 WebDriver driver= new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://demoqa.com/droppable/");

    Robot r= new Robot();
    r.keyPress(KeyEvent.VK_PAGE_DOWN);
    r.keyRelease(KeyEvent.VK_PAGE_DOWN);
    Thread.sleep(2000);
    r.keyPress(KeyEvent.VK_PAGE_DOWN);
    r.keyRelease(KeyEvent.VK_PAGE_DOWN);
    Thread.sleep(2000);
    r.keyPress(KeyEvent.VK_PAGE_DOWN);
    r.keyRelease(KeyEvent.VK_PAGE_DOWN);
    
    Thread.sleep(2000);
	 WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));
	 WebElement dest = driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));
	 Actions act= new Actions(driver);
	  act.dragAndDrop(src, dest).perform();
	  
	  Thread.sleep(3000);
	  
	  TakesScreenshot ts= (TakesScreenshot) driver;
	 File src1=ts.getScreenshotAs(OutputType.FILE);
	 File dest1= new File("C:\\Users\\vicky\\OneDrive\\Desktop\\AUTOMATION_SELENIUM\\SuryaBhaiAutomation\\Screenshot\\Drop1.png");
	 Files.copy(src1, dest1);
	  System.out.println("test passed");
}
}
