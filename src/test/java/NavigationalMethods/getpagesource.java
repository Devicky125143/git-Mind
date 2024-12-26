package NavigationalMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getpagesource {
 public static void main(String[] args) {
	 //getpage source is used to retrives the page source of the current webpage
	 WebDriver driver= new ChromeDriver();
	  driver.get("https://www.google.com");
	  System.out.println("page source "+driver.getPageSource());
	  
	  
}
}
