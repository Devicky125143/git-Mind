package NavigationalMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettitle {
 public static void main(String[] args) {
	 //get title is used to retrives the title of current webpage
	 WebDriver driver= new ChromeDriver();
	  driver.get("https://www.google.com");
	  System.out.println("get title : "+driver.getTitle());
}
}
