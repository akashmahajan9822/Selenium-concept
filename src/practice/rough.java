package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class rough {
	
	public static String readdata(int row,int col) throws IOException  {
		String path=System.getProperty("user.dir")+"\\TestData2.xlsx" ;
		//String path=System.getProperty("user.dir")+"\\TestData2.xlsx";		
		
		System.out.println(path);
       File a1=new File(path);
       
       
		FileInputStream fis=new FileInputStream(a1);
		
		//Apache poi
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=wb.getSheetAt(0);
		
		String value=sheet.getRow(row).getCell(col).getStringCellValue();
		System.out.println(value);
		return value;
	
		
			}
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
	    
		    rough.readdata(0, 0) ;
		    
		   
	}
}
