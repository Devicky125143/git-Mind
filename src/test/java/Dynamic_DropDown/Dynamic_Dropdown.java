package Dynamic_DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Dropdown {
  public static void main(String[] args) throws Exception {
	 WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("surya");
	  Thread.sleep(3000);
	  List<WebElement>options=driver.findElements(By.xpath("//div[@class='eIPGRd']"));
      
	  System.out.println(options.size());
	  
	  for(int i=0;i<options.size();i++) {
		  System.out.println(options.get(i).getText());
	  }
	  
	  System.out.println("====Click the Surya namaskar====");
	  
	  Thread.sleep(2000);
	  
	  for(int i=0;i<options.size();i++) {
		  if(options.get(i).getText().equals("surya movies")) {
		  options.get(i).click();
		  break;
		  }
	  }
	  System.out.println("===test pass===");

  }
}
