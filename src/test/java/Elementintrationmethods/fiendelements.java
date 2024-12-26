package Elementintrationmethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fiendelements {
	 public static void main(String[] args) {
	    	//find the address of all matching elements
			WebDriver driver= new ChromeDriver();
			 driver.get("https://google.com");
			 List<WebElement> links = driver.findElements(By.tagName("a"));
			 System.out.println("find elements : "+links.size());
}
}
