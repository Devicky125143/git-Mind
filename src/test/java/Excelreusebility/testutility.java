package Excelreusebility;

import java.io.IOException;

import org.testng.annotations.Test;

public class testutility  {
  @Test
  public void Tc1() throws IOException {
	  Utality ua= new Utality("C:\\Users\\vicky\\OneDrive\\Desktop\\Info.xlsx" );
	  int rows = ua.getRows("Sheet1");
	  int cells = ua.getCell("Sheet1", 2);
	  String data = ua.getData("Sheet1", 1, 0);
	  
			  System.out.println(rows);
  System.out.println(cells);
  System.out.println(data);
  
  System.out.println("==================================================");
  }
  
 @Test
  public String [][]getdata() throws IOException{
	  Utality ua=new Utality("C:\\Users\\vicky\\OneDrive\\Desktop\\Info.xlsx");
	  int rows=ua.getRows("Sheet1");
	  int cols=ua.getCell("Sheet1",2);
	   System.out.println("hvjfdhd"+rows);
	   System.out.println("dcsjibdisbd"+cols);
	  String [][] value=new String[rows][cols];
	  return value;
  }
}
