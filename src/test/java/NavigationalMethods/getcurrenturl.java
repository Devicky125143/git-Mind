package NavigationalMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getcurrenturl {
 public static void main(String[] args) {
	//retrives the url of current webpage
	 WebDriver driver= new ChromeDriver();
	  driver.get("https://www.googl.com");
	  String url= driver.getCurrentUrl();
	  System.out.println("Current url : "+url);
}
}
