package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sample {
	public static WebDriver driver;
  public static void main(String[] args) throws Exception {
	 
	  String path="C:\\Users\\vicky\\OneDrive\\Desktop\\AUTOMATION_SELENIUM\\SuryaBhaiAutomation\\configuration\\data.properties";
	  
	  File f= new File(path);
	                               //cross browser is nothing but one application open in diffrent browsers is called cross browser
	  FileInputStream fisp=new FileInputStream(f);
	  Properties p= new Properties();
	  p.load(fisp);
	  String data=p.getProperty("Browser");
	  System.out.println(data);
	  String URL = p.getProperty("url");
	  System.out.println(URL);
	  
	if(data.equalsIgnoreCase("Chrome")) {
		driver=new ChromeDriver();
	}
	else if(data.equalsIgnoreCase("Edge")) {
		driver=new EdgeDriver();
	}
	else if(data.equalsIgnoreCase("firefox")) {
		driver=new FirefoxDriver();
	}
	driver.get(URL);
	driver.manage().window().maximize();

	  
}
}
