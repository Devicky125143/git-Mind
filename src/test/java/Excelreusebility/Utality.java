package Excelreusebility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Utality {
   
	public XSSFWorkbook wb;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;
	
	public File f;
	public FileInputStream fis;
	String path;
	
	public Utality(String path) {
		this.path=path;
		
	}
	
	public int getRows(String sheetname) throws IOException {
		f=new File(path);
		fis=new FileInputStream(f);
		wb=new XSSFWorkbook(fis);
		sheet=wb.getSheet(sheetname);
		int rows=sheet.getLastRowNum();
		return rows;
		
	}
	public int getCell(String sheetname,int rownum) throws IOException {
		f=new File(path);
		fis=new FileInputStream(f);
		wb=new XSSFWorkbook(fis);
		
		sheet=wb.getSheet(sheetname);
		row=sheet.getRow(rownum);
		int cell=row.getLastCellNum();
		return cell;
		
	}
	public String getData(String sheetname,int rownum,int colnum) throws IOException {
		f=new File(path);
		fis=new FileInputStream(f);
		wb=new XSSFWorkbook(fis);
		
		sheet=wb.getSheet(sheetname);
		row=sheet.getRow(rownum);
		cell=row.getCell(colnum);
		String data=cell.getStringCellValue();
		return data;
	
}
	
}
