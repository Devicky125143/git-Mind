package Fileuploding;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class Fileupload {
 public static void main(String[] args) throws Exception {
	WebDriver driver= new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.naukri.com/nlogin/login?URL=https://www.naukri.com/mnjuser/homepage");
	 WebElement regbtn = driver.findElement(By.xpath("//a[@title='Jobseeker Register']"));
	 Thread.sleep(3000);
	 regbtn.click();
	 
	 WebElement expbtn = driver.findElement(By.xpath("(//div[@tabindex='0'])[1]"));
	 
	 JavascriptExecutor js= (JavascriptExecutor) driver;
	 js.executeScript("arguments[0].scrollIntoView();",expbtn);
	 
	 Thread.sleep(2000);
	 expbtn.click();
	 
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
	 Thread.sleep(2000);
	 String path="C:\\Users\\vicky\\OneDrive\\Desktop\\Atchutarao.docx";
	StringSelection select= new StringSelection(path);
	Clipboard clip=Toolkit.getDefaultToolkit().getSystemClipboard();
	clip.setContents(select, select);
	 
	 Robot r= new Robot();
	 r.keyPress(KeyEvent.VK_CONTROL);
	 r.keyPress(KeyEvent.VK_V);
	 
	 r.delay(1000);
	 
	 r.keyRelease(KeyEvent.VK_CONTROL);
	 r.keyRelease(KeyEvent.VK_V);
	 
	 r.delay(1000);
	 
	 r.keyPress(KeyEvent.VK_ENTER);
	 r.keyRelease(KeyEvent.VK_ENTER);
	 
	 Thread.sleep(4000);
	 
	 TakesScreenshot ts= (TakesScreenshot) driver;
	 File src = ts.getScreenshotAs(OutputType.FILE);
	 File dest= new File("C:\\Users\\vicky\\OneDrive\\Desktop\\AUTOMATION_SELENIUM\\SuryaBhaiAutomation\\Screenshot\\webpage.pdf");
	 Files.copy(src, dest);
	 
	
}
}
