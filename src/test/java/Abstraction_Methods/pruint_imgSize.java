package Abstraction_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pruint_imgSize {
   public static void main(String[] args) {
	 WebDriver driver= new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://demowebshop.tricentis.com/login");
	 
	 //print the img size
	 
	 WebElement LOGO = driver.findElement(By.xpath("//img"));
	   Dimension SIZE = LOGO.getSize();
	   System.out.println(SIZE);
}
}
