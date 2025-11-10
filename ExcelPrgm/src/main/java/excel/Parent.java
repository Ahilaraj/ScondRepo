package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Parent {
	static FileInputStream f; // to read details from the file
	static XSSFWorkbook wb; //inbuilt class of apache , to read details from workbook
	static XSSFSheet sh; // to read details form the sheet
	
	public static String getStringData(int a,int b) throws 
IOException
	{
		f=new FileInputStream("C:\\Users\\EMVIGO-USER\\Desktop\\Book1.xlsx");
		wb= new XSSFWorkbook(f);
		sh=wb.getSheet("sheet1"); // to get method from sheet
		XSSFRow r =sh.getRow(a); // XSSFRow to read details from sheet . getRow to get details from row
		XSSFCell c = r.getCell(b); //XSSFCell is a class to get deails from cell
		return c.getStringCellValue(); // to get details from string
	}
	
	public static String getIntegerData (int a , int b) throws IOException
	{
		f = new FileInputStream("C:\\Users\\EMVIGO-USER\\Desktop\\Book1.xlsx");
		wb = new XSSFWorkbook(f);
		sh = wb.getSheet("sheet1");
		XSSFRow r = sh.getRow(a);
		XSSFCell c = r.getCell(b);
		int x = (int)c.getNumericCellValue();
		return String.valueOf(x);
		
	}
	
	public static String getFloatData (int a , int b) throws IOException
	{
		f = new FileInputStream("C:\\Users\\EMVIGO-USER\\Desktop\\Book1.xlsx");
		wb = new XSSFWorkbook(f);
		sh = wb.getSheet("sheet1");
		XSSFRow r = sh.getRow(a);
		XSSFCell c = r.getCell(b);
		float x = (float)c.getNumericCellValue();
		return String.valueOf(x);
		
	}
}
