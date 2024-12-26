package Task;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.google.common.io.Files;

public class AutomationApp {
   public static void main(String[] args) throws Exception {
	 WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  System.out.println("===TEST_CASE: 01===");
	  
	  //01.open the page
	  
	     System.out.println("                ");
	     System.out.println("===Open The Page===");
	  driver.get("https://practicetestautomation.com/logged-in-successfully/");
     driver.findElement(By.linkText("Log out")).click();
     Thread.sleep(2000);
     Robot r= new Robot();
     r.keyPress(KeyEvent.VK_PAGE_DOWN);
     r.keyRelease(KeyEvent.VK_PAGE_DOWN);
     Thread.sleep(2000);
     r.keyPress(KeyEvent.VK_PAGE_DOWN);
     r.keyRelease(KeyEvent.VK_PAGE_DOWN);
     
     //02. Enter the User name
     
    WebElement  user=driver.findElement(By.xpath("//input[@id='username']"));
     user.sendKeys("student");
      Thread.sleep(2000);
      
      //03. Enter The password
      
      
       WebElement pwd=driver.findElement(By.xpath("//input[@id='password']"));
       pwd.sendKeys("Password123");
       Thread.sleep(2000);
       
       //04. Push The submit Button
       
       
        driver.findElement(By.xpath("//button[@id='submit']")).click();
        Thread.sleep(2000);
        
        //05. Verify The URL VALIDATION 
        
        String expurl="https://practicetestautomation.com/logged-in-successfully/";
        String acturl=driver.getCurrentUrl();
        Assert.assertEquals(expurl, acturl);
        System.out.println("===URL TEST PASSED===");
        
        //06. verify the new expected text
        
        WebElement successtext = driver.findElement(By.xpath("//strong[text()='Congratulations student. You successfully logged in!']"));
        System.out.println(successtext.getText());
        String exptext="//strong[text()='Congratulations student. You successfully logged in!']";
        String acttext=successtext.getText();
        if(exptext.contains(acttext)) {
        	 System.out.println("====SUCCESS TEXT PASSED====");
        }
        

        
        //07.LoginButton Displayed
        
         WebElement Logoutbtn = driver.findElement(By.xpath("//a[@class='wp-block-button__link has-text-color has-background has-very-dark-gray-background-color']"));
          boolean display = Logoutbtn.isDisplayed();
          System.out.println("LogoutButton Displayed : "+display);
          Thread.sleep(2000);
          
          
          System.out.println("                       ");
          System.out.println("===TEST_CASE : 02===");
         
          //TEST--2
          
          //02.USER NAME VALIDATION
          
          driver.navigate().back();
          user.clear();
          Thread.sleep(1000);
          user.sendKeys("atchutarao");
          Thread.sleep(1000);
          pwd.clear();
          pwd.sendKeys("Pasword123");
          Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='submit']")).click();
        
        //05.verify the error message DISPLAYED	
      
        WebElement errormsg = driver.findElement(By.xpath("//div[text()='Your username is invalid!']"));
         
            System.out.println("5. Error message Displayed :"+ errormsg.isDisplayed());
           
        
        String exptError="Your username is invalid!";
        String actError=errormsg.getText();
        
        Assert.assertEquals(exptError, actError);
    
        System.out.println("===ERROR MESSAGE VALIDATION SUCCESSFULL===");
        
        Thread.sleep(3000);
        
        System.out.println("                 ");
        
        System.out.println("===TEST_CASE : 03===");
     
        //TEST---3
        
        //PASSWORD VALIDATION
        
        
       
        user.clear();
        Thread.sleep(1000);
        user.sendKeys("student");
        Thread.sleep(1000);
        pwd.clear();
        Thread.sleep(1000);
        pwd.sendKeys("7036121546");
        Thread.sleep(1000);
       
        driver.findElement(By.xpath("//button[@id='submit']")).click();
        Thread.sleep(2000);
        
        //05.ERROR MESSAGE VALIDATION
        
        WebElement pwderrormsg = driver.findElement(By.xpath("//div[text()='Your password is invalid!']"));
        
        System.out.println("5. Error message Displayed :"+pwderrormsg.isDisplayed());
        
       
        //06.VERIFY THE ERROR MESSAGE TEXT
        
        String exppwderror="Your password is invalid!";
        String actpwderror=pwderrormsg.getText();
        System.out.println(pwderrormsg.getText());
   Assert.assertEquals(exppwderror, actpwderror);
        System.out.println("===PASSWORD ERROR MSG VALIDATION PASSED===");
        Thread.sleep(3000);
        driver.quit();
        
        
         
         
        
          
   }
}
