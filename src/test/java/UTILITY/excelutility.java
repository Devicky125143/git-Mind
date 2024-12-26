package UTILITY;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelutility {
  public XSSFWorkbook wb;
  public XSSFSheet sheet;
  public XSSFRow row;
  public XSSFCell cell;
  public File f;
  public FileInputStream fis;
  public String path;
  
  public excelutility(String path) {
	  this.path=path;
  }
  public int getrow(String Sheet1) throws IOException {
	  f=new File(path);
	  fis=new FileInputStream(f);
	  wb=new XSSFWorkbook(fis);
	  sheet=wb.getSheet("Sheet1");
	  //find the rows 
	  int Rows = sheet.getLastRowNum();
	  return Rows;
  }
  
  public int getcell(String Sheet1,int Rows) throws IOException {
	  f=new File(path);
	  fis=new FileInputStream(f);
	  wb=new XSSFWorkbook(fis);
	  sheet=wb.getSheet("Sheet1");
	  row=sheet.getRow(1);
	  //find the columns
	  int Columns = row.getLastCellNum();
	  return Columns;
	  
  }
  
  public String getdata(String Sheet1,int Row, int Col) throws IOException {
	  f=new File(path);
	  fis=new FileInputStream(f);
	  wb=new XSSFWorkbook(fis);
	  sheet=wb.getSheet("Sheet1");
	  row=sheet.getRow(2);
	  cell=row.getCell(2);
	  //find the data
	  String Data=cell.getStringCellValue();
	  return Data;
  }
}
