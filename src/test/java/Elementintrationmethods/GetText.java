package Elementintrationmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
 public static void main(String[] args) {
	 WebDriver driver= new ChromeDriver();
	  driver.get("https://grapha.ai/");
	  WebElement element = driver.findElement(By.xpath("//button[@class='clickable-element bubble-element Button cmaNbaZ']"));
	   String Text=element.getText();
	   System.out.println(Text);
	  
	  
	  
}
}