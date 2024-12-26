package Abstraction_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Attributevalue {
   public static void main(String[] args) throws Exception {
	   WebDriver driver= new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://demowebshop.tricentis.com/login");
		 WebElement regbtn = driver.findElement(By.linkText("Register"));
		 String link = regbtn.getAttribute("href");
		 System.out.println(link);
		 regbtn.click();
		 Thread.sleep(3000);
		 driver.quit();
}
}
