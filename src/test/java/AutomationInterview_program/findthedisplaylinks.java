package AutomationInterview_program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class findthedisplaylinks {
   public static void main(String[] args) {
	 WebDriver driver= new ChromeDriver();
	  driver.get("https://www.irctc.com");
	  
	  List<WebElement> links=driver.findElements(By.tagName("a"));
	  
	  
	  int totallinks=links.size();
	  
	  System.out.println(totallinks);
	  
	  int display=0;
	  
	  for(int i=0;i<totallinks;i++) {
		  if(links.get(i).isDisplayed()) {
			  display++;
		  }
	  }
	  System.out.println(display);
}
}
