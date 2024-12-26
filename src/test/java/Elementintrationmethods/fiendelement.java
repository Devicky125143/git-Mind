package Elementintrationmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fiendelement {
    public static void main(String[] args) {
    	//find the address of one matching elemenet 
		WebDriver driver= new ChromeDriver();
		 driver.get("https://google.com");
		 WebElement ele = driver.findElement(By.xpath("(//input[@type='submit'])[3]"));
		 System.out.println(ele);
	}
}
