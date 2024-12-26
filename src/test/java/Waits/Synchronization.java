package Waits;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class Synchronization {
    public static void main(String[] args) throws Exception {
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("https://demoqa.com/progress-bar");
		 JavascriptExecutor js= (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,300)");
		 driver.findElement(By.xpath("//button[@id='startStopButton']")).click();
		 //Thread.sleep(15000);
		  
		  WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		 
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='resetButton']")));
		 
		 WebElement reset = driver.findElement(By.xpath("//button[@id='resetButton']"));
		 
		 reset.click();
		 
		 TakesScreenshot ts= (TakesScreenshot) driver;
		 File src = ts.getScreenshotAs(OutputType.FILE);
		 File dest=new File("C:\\Users\\vicky\\OneDrive\\Desktop\\AUTOMATION_SELENIUM\\SuryaBhaiAutomation\\Screenshot\\waits.png");
		 Files.copy(src, dest);
		 System.out.println("===Test Pass===");
    }
}
