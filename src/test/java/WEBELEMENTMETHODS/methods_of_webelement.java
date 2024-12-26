package WEBELEMENTMETHODS;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class methods_of_webelement {
    public static void main(String[] args) throws InterruptedException {
		 WebDriver driver= new ChromeDriver();
		  driver.manage().window().maximize();
		  
		  //get
		  
		  driver.get("https://demowebshop.tricentis.com/login");
		  
		  Thread.sleep(3000);
		  
		  //webelement color print
		  
		  WebElement register = driver.findElement(By.linkText("Register"));
		  String color=register.getCssValue("color");
		  System.out.println("color = "+color);
		  
		  //print the getattributevalue
		  
		  String url=register.getAttribute("href");
		  System.out.println("url = "+url);
		  
		  //click
		  
		  register.click();
		  
		  Thread.sleep(3000);
		  
		  WebElement malebutton = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		  
		  boolean display=malebutton.isDisplayed();
		  System.out.println("Displaying ? : "+display);
		  
		  Thread.sleep(2000);
		  boolean beforeclick= malebutton.isSelected();
		  System.out.println("before click = "+beforeclick);
		  
		  malebutton.click();
		  
		  boolean afterclick= malebutton.isSelected();
		  System.out.println("after click ="+afterclick);
		  
		  //sendkeys
		  
		  WebElement FirstName = driver.findElement(By.xpath("//input[@id='FirstName']"));
		  FirstName.sendKeys("Atchutarao");
		  Thread.sleep(2000);
		  
		  //clear
		  
		  FirstName.clear();
		  Thread.sleep(1000);
		  FirstName.sendKeys("VICKY");
		  
		  //img size
		  
		  WebElement LOGO = driver.findElement(By.xpath("//img"));
		  Dimension size=LOGO.getSize();
		  System.out.println("LOGO SIZE: "+size);
		  
		  
		  
	}
}
