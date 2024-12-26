package Abstraction_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button_is_Displayed {
   public static void main(String[] args) throws Exception {
	WebDriver driver= new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://demowebshop.tricentis.com/login");
	 WebElement regbutn = driver.findElement(By.linkText("Register"));
	  regbutn.click();
	  Thread.sleep(2000);
	 WebElement malebtn = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
	 boolean display = malebtn.isDisplayed();
	 System.out.println(display);
	 
	 //before click
	 
	 Thread.sleep(2000);
	 
	 boolean beforeclick = malebtn.isSelected();
	 System.out.println("Before click :"+beforeclick);
	 
	 malebtn.click();
	 
	 //after click
	 
	 boolean afterclick = malebtn.isSelected();
	 System.out.println(afterclick);
	 
	 
}
}
