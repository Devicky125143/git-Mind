package INTERVIEW;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;import Abstraction_Methods.webelement_color_print;

public class Table_handling {
  public static void main(String[] args) {
	
	  WebDriver driver= new ChromeDriver();
	  WebElement table = driver.findElement(By.tagName("table"));    //  ID   Name   LOC  State
	 List<WebElement> rows = table.findElements(By.tagName("tr"));   // 1st    A     ABC    XYZ
	 System.out.println(rows.size());                               //  2nd    B     EFG    LMN
	                                                                //  3rd    c     HIJ    PQR
	 List<WebElement> Header = table.findElements(By.tagName("th"));
	 System.out.println(Header.size());
	 List<WebElement> data = table.findElements(By.tagName("td"));
	 System.out.println(data.size());
	 
	 for(int i=1;i<rows.size();i++) {
		 List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
		 System.out.println(i+"="+cols.size());
		 
	 }
}
  
}
