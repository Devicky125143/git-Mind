package Abstraction_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement_color_print {
   public static void main(String[] args) {
	 WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demowebshop.tricentis.com/login");
	  WebElement reg= driver.findElement(By.xpath("(//input[@type='button'])[2]"));
	  String bgcolor = reg.getCssValue("color");
	  System.out.println(bgcolor);
	  driver.quit();
}
}
