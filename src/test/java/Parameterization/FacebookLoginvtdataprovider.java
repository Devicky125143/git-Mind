package Parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FacebookLoginvtdataprovider {
   @Test(dataProvider = "fcdata")
   public void fclogin(String user,String password) throws Exception {
	 WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com");
	  driver.findElement(By.xpath("//input[@type='text']")).sendKeys(user);
	  driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  //driver.close();
	  
   }
   @DataProvider(name="fcdata")
   public String[][]getdata(){
	   String [][]str= {{"meeta_ragunath","ram@1245"},{"vicky","vicky123"},{"chinnu","ch123"},{"devicky","dv125"}};
	   return str;
   }
 
}
