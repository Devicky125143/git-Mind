   package Fileuploding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
  @Test(dataProvider = "ram")
  public void loginpage(String user, String pass) {
	  WebDriver driver= new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.facebook.com");
	   driver.findElement(By.xpath("//input[@type='text']")).sendKeys(user);
	   driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pass);
	   driver.findElement(By.xpath("")).click();
  }
	   @DataProvider(name = "ram")
	   public String[][] getdata() {
		   String data[][]= {{"atchuth","atchuth12"},{"atchuraia","hasdgu49"}};
		   return data;
		   
	   
  }
}
