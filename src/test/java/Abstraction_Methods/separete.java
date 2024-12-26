package Abstraction_Methods;

import java.io.IOException;

import org.testng.annotations.Test;

import Excelreusebility.Utality;

public class separete {
	 
	 @Test
	  public String getdata() throws IOException{
		  Utality ua=new Utality("C:\\Users\\vicky\\OneDrive\\Desktop\\Info.xlsx");
		  int rows=ua.getRows("Sheet1");
		  int cols=ua.getCell("Sheet1",2);
		   System.out.println("hvjfdhd"+rows);
		   System.out.println("dcsjibdisbd"+cols);
		   String data = ua.getData("Sheet1", 1, 0);
		  return data;
	  }
	}


