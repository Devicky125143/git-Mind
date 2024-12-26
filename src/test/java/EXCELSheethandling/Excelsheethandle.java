package EXCELSheethandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excelsheethandle {
    @Test
	public void WBTC() throws IOException {
		String path="C:\\Users\\vicky\\OneDrive\\Desktop\\mydata.xlsx";
		File f= new File(path);
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("sheet1");
		XSSFRow row=sheet.getRow(1);
		XSSFCell cell=row.getCell(0);
		String data=cell.getStringCellValue();
		System.out.println(data);
		
		System.out.println(sheet.getRow(5).getCell(6).getNumericCellValue());
	}
}
